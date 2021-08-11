package br.edu.cassio;

import java.util.Scanner;

public class Principal {
	
	public static void main(String a[]) {
		Cliente c = new Cliente();	
		c.setNome("Maria");
		c.setCpf("234234556");
		c.setRg("234562");
		c.setTelefone("3442-4521");
		c.setEndereco("Rua Tancredo Neves, 524");
		System.out.println(c); 
	}

}
