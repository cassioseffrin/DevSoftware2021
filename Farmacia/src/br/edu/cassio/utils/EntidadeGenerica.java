package br.edu.cassio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


import br.edu.cassio.interfaces.InterfaceSerializacaoGenerica;

public class EntidadeGenerica implements InterfaceSerializacaoGenerica {

	@Override
	public  <E> boolean salvarEntidade(E elemento, String strArquivo) {
		List<E> lstGenerica = lerLista(strArquivo);
		lstGenerica.add(elemento);
		return salvarLista(lstGenerica, strArquivo);
	}

	@Override
	public <E> List<E> lerLista(String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<E> lst = (List<E>) ois.readObject();
			return lst;
		} catch (FileNotFoundException e) {
			criarListaVazia(strArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public <E> List<E> criarListaVazia(String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileOutputStream fos = new FileOutputStream(arquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			List<E> lst = new ArrayList<E>();
			oos.writeObject(lst);
			System.out.printf("lista vazia persistida");
			return lerLista(strArquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public <E> boolean salvarLista(List<E> lstEntidades, String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileOutputStream fos = new FileOutputStream(arquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lstEntidades);
			System.out.printf("A entidade foi salvo!!!");
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public <E> void imprimirLista(  String strArquivo) {
		List<E> lista = lerLista(strArquivo);
		for (E obj : lista) {
			System.out.println(obj);
		}
		
	}

}
