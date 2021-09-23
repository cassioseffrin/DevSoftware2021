package br.edu.cassio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.edu.cassio.models.Funcionario;

public class Principal {
	public static void main(String a[]) {
//		List<Cliente> lstClientes = Cliente.lerTodos();
//		System.out.println(lstClientes.size());	
//		for (Cliente c : lstClientes) {
//			System.out.println("Nome: " + c.getNome() + " CPF: " +c.getCpf());
//		}
		
		List<Funcionario> lstFunc = Funcionario.lerLista();
		for (Funcionario f : lstFunc) {
			System.out.println("Nome: " + f.getNome() + " CPF: " +f.getCpf());
		}
		
		
//		Funcionario f = new Funcionario();
//		f.setNome("Natalia");
//		f.setCpf("234634535");
//		f.setRg("234234234");
//		f.setPis("234234");
//		f.setPasep("2342349686");
//		f.setSalario(24234.45);
//		f.setCarteiraTrabalho("FA2234");
//		f.salvar(f.ARQUIVO, f.toString());
		
	}
}
