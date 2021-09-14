package Farmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class genericos {
	
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
}