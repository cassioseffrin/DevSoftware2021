package br.edu.cassio.recursividade;

import java.util.Scanner;

public class MegaSena {

	public static double fatorial(double n) {
		if (n == 1) {
			return n;
		}
		return n * fatorial(n - 1);
	}

	public static void main(String a[]) {
		String texto = " texto qualquer";
		System.out.printf("O Numero de apostas para acertar na megasena é: %2f",
				fatorial(60) / (fatorial(6) * fatorial(54)));
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite um numero: ");
//		double numero = scan.nextDouble();
//		System.out.printf("O fatorial do numero %s é: %f2$:", numero, fatorial(numero));
	}

}
