package br.unc.rener.testes;

import java.util.Scanner;

public class TesteEntradaSaidaConsole {
	
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: "  );
		String nome = scan.nextLine();
		System.out.println("seu nome é: " + nome );
		scan.close();
	}

}
