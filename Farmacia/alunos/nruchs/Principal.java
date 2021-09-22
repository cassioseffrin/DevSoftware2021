package br.edu.nruchs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String a[]) {
		List<Funcionario> lstFunc = Funcionario.lerLista();
		for (Funcionario f : lstFunc) {
		System.out.println("Nome: " + f.getNome() + " CPF: " +f.getCpf());
	}
	
		/*
		public static void main(String a[]) {
		List<Cliente> lstClientes = Cliente.lerTodos();
		System.out.println(lstClientes.size());	
		for (Cliente c : lstClientes) {
			System.out.println("Nome: " + c.getNome() + " CPF: " +c.getCpf());
		}
		 */	
		/*
		 * 	public static void main(String[] args) throws IOException {
		List<Pessoa> lstPessoa = Pessoa.lerTodos();
		for (Pessoa pessoa : lstPessoa) {
			System.out.println("Nome: "+pessoa.getNome()+" CPF: "+pessoa.getCpf()+" RG: "+pessoa.getRg());
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * Cliente p = new Cliente(); System.out.print("Digite seu nome: ");
		 * p.setNome(scan.nextLine()); System.out.print("Digite seu CPF: ");
		 * p.setCpf(scan.nextLine()); System.out.print("Digite seu RG: ");
		 * p.setRg(scan.nextLine()); System.out.print("Digite seu telefone: ");
		 * p.setTelefone(scan.nextLine());
		 * 
		 * 
		 * p.salvar(); scan.close();
		 */
	}
}