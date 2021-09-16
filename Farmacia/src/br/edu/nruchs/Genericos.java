package br.edu.nruchs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Genericos {
	
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
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro ao gravar.");
		}
	}

   /*
    * Resolver repeticao de codigo com Generics
    */	
	public static <E> void imprimirArrayGeneric(E[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\nValor Generico posicao[%s] : %s",i, elementos[i]);
		}	
	}
	
	
	
	public static void imprimirArray(Integer[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\nValor Inteiro posicao[%s] : %s",i, elementos[i]);
		}		
	}
	public static void imprimirArrayDouble(Double[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\nValor String posicao[%s] : %s",i, elementos[i]);
		}		
	}
	public static void imprimirArrayString(Double[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\nValor Double posicao[%s] : %s",i, elementos[i]);
		}		
	}
	public static void imprimirArrayData(Date[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\nValor Double posicao[%s] : %s",i, elementos[i]);
		}		
	}
 
	public static void main (String array[]) {
		Integer[] inteiros = { 5, 6, 2, 6, 9, 3, 8 };
		Double[] flutuantes = { 5.32, 6.42, 2.234, 6.234, 9.342, 3.75, 8.23 };
		String[] strings = { "Maria", "Joao", "Jose" };
		Date[] datas = { new Date( 2010, 10, 10), new Date() };
		Genericos.imprimirArrayGeneric(inteiros);
//		Genericos.imprimirArrayDouble(flutuantes);
//		Genericos.imprimirArrayString(strings);
	}
}