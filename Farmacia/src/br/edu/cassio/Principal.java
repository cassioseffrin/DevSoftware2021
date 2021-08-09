package br.edu.cassio;

import java.util.Scanner;

public class Principal {
	
	public static void main(String a[]) {
		Cliente c = new Cliente();
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: "  );
		String nome = scan.nextLine();
		System.out.println("seu nome é: " + nome );
		scan.close();
		
		
		
		
		
//		c.setNome("Maria");
//		c.setTelefone("3442-4521");
//		System.out.println("Nome: " + c.getNome());
//		System.out.println("Telefone: " + c.getTelefone());
		
	}

}
