package br.edu.cassio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String a[]) {
		Cliente c = new Cliente();
		c.setNome("Joao");
		c.setCpf("234234556");
		c.setRg("234562");
		c.setTelefone("3442-4521");
		c.setEndereco("Rua Tancredo Neves, 234");
		c.salvar();
	}

}
