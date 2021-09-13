package bruno.bevilaqua;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Generico implements SerializacaoGenerica {
	
	public static List<String[]> lerArquivo(String arquivo) {
		File f = new File(arquivo);
		FileInputStream fis;
		List<String[]> lstGeneric = new ArrayList<String[]>();
		try {
			fis = new FileInputStream(f);
			Scanner scan = new Scanner(fis);
			
			while(scan.hasNext()) {
				String linha = scan.nextLine();
				String arr[] = linha.split(";");
				lstGeneric.add(arr);
			}
			scan.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Erro ao Gravar");
		}
		return lstGeneric;
	}
	
	public static<E> void escreverArquivo(String arquivo, E dados) {
		try {
			File f = new File(arquivo);
			FileOutputStream fos = new FileOutputStream(f, true);
			String txt = dados.toString()+"\n";
			fos.write(txt.getBytes());
			fos.close();
			System.out.println("Gravado com sucesso.");
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro ao gravar.");
		}
	}
	
	@Override
	public <E> List<E> criarListaVazia(File f) {
		List<E> lstEntidades = new ArrayList<>();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		lstEntidades  = new ArrayList();
		return lstEntidades;
	}

	@Override
	public <E> boolean salvarEntidade(E entidade, String strArquivo) {
		List<E> lstEntidade = lerTodasEntidades(strArquivo);
		lstEntidade.add(entidade);
		return salvarListaEntidades(lstEntidade, strArquivo);
	}

	@Override
	public <E> List<E> lerTodasEntidades(String strArquivo) {
		File f = new File(strArquivo);
		FileInputStream fis;
		List<E> lstEntidades = new ArrayList<E>();
		try {
			try {
				fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				lstEntidades = (List<E>) ois.readObject();
			} catch (FileNotFoundException e) {
				lstEntidades = criarListaVazia(f);
			} catch (ClassNotFoundException e) {
				System.out.println("Deu pau");
				lstEntidades = new ArrayList();
				e.printStackTrace();
			}
		} catch (IOException e) {
			lstEntidades = new ArrayList();
		}
		return lstEntidades;
	}

	@Override
	public <E> boolean salvarListaEntidades(List<E> lstEntidades, String strArquivo) {
		/* Serializar lista de Funcionários */
		File f = new File(strArquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println(lstEntidades);
			oos.writeObject(lstEntidades);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public <E> void showLista(String strArquivo) {
		List<E> lstEntidades = lerTodasEntidades(strArquivo);
		for (E entidade : lstEntidades) {
			System.out.println(entidade);
		}
	}
}
