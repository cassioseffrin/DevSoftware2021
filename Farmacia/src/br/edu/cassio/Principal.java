package br.edu.cassio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String a[]) {
		List<Cliente> lstClientes = Cliente.lerTodos();
		System.out.println(lstClientes.size());	
		for (Cliente c : lstClientes) {
			System.out.println("Nome: " + c.getNome() + " CPF: " +c.getCpf());
		}
	}
}
