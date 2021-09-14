package br.edu.cassio;

import java.util.Date;

public class Genericos {
	
	
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
