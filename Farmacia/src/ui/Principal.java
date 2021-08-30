package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.cassio.Cliente;

public class Principal {

	public static void main(String array[]) {
		montaTelaPrincipal();
	}

	private static void montaTelaPrincipal() {

		System.out.println("\f SISTEMA FARMACEUTICO FARMUNC\n\n\n");
		System.out.println("1. CADASTROS");
		System.out.println("2. ESTOQUE");
		System.out.println("3. RELATORIOS");
		System.out.println("4. AJUDA");
		System.out.println("5. SAIR\n\n\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		irTela(op);
	}

	private static void irTela(Integer op) {
		if (op == 1) {
			irMenuCadastro();
		} else if (op == 3) {
			irMenuRelatorio();
		}
	}

	private static void irMenuCadastro() {

		System.out.println("\f CADASTROS\n\n\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n\n\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 5) {
			montaTelaPrincipal();
		} else if (op == 1) {
			cadastroCliente();
		}
	}

	private static void irMenuRelatorio() {
		
	

		System.out.println("\f RELATORIOS\n\n\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n\n\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			relatorioCliente();
		}
	}

	private static void relatorioCliente() {
		System.out.println("IMPRIMINDO CLIENTE \n\n\n");
		List<Cliente> lst = lerLista();
		if (lst != null) {
			
			for (Cliente c: lst) {
				System.out.println(c.imprimir());
			}
			
		}
		
		System.out.println("\n\n Digite uma op 1 : Menu - 2 : Relatorios");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			montaTelaPrincipal();
		}else	if (op == 2) {
			irMenuRelatorio();
		}
	}
	
	
	private static List<Cliente> lerLista(){
		try {
			File arquivo = new File(Cliente.ARQUIVO_SERIAL);
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Cliente> lst = (List<Cliente>) ois.readObject();
			return lst;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void cadastroCliente() {
		Scanner s = new Scanner(System.in);
		Cliente c = new Cliente();
		System.out.println("CADASTRANDO CLIENTE \n\n\n");
		
		System.out.println("Nome: ");
		c.setNome(s.nextLine());
		System.out.println("CPF");
		c.setCpf(s.nextLine());
		System.out.println("RG");
		c.setRg(s.nextLine());
		System.out.println("Telefone");
		c.setTelefone(s.nextLine());
		System.out.println("Endereco");
		c.setEndereco(s.nextLine());
		
		
		List<Cliente> lst = lerLista();
		lst.add(c);

		try {
			File arquivo = new File(Cliente.ARQUIVO_SERIAL);
			FileOutputStream fos = new FileOutputStream(arquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lst);
			System.out.printf("O cliente foi salvo!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		montaTelaPrincipal();
 
	}

}
