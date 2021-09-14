package Farmacia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Menu();
	}
	private static void Menu() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		System.out.println("------------------ SISTEMA FARMACEUTICO -------------------");
		
		System.out.println("1. Cadastro");
		System.out.println("2. Estoque ");
		System.out.println("3. Relatórios");
		System.out.println("4. Ajuda");
		System.out.println("5. Sair");
		System.out.print("Digite uma das opções a cima: ");
		Scanner scan = new Scanner(System.in);
		Integer opc = scan.nextInt();
		if (1 == opc); {
			Cadastros();
		}else if (3 == opc) {
			Relatorios();
		}
		scan.close();
	}

	private static void Cadastros() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		System.out.println("-------------------- CADASTROS -----------------------");
		
		System.out.println("1. Cliente");
		System.out.println("2. Funcionario");
		System.out.println("3. Farmaceutico");
		System.out.println("4. Produtos");
		System.out.println("5. Voltar");
		System.out.print("Digite uma das opções a cima: ");
		Scanner scan = new Scanner(System.in);
		Integer opc = scan.nextInt();
		if (5 == opc) {
			Menu();
		}else if (1 == opc){
			CadastroCliente1();
		}else if (2 == opc) {
			CadastroFuncionario();
		}
		scan.close();

	}
	/*CADASTROS*/
	private static void CadastroFuncionario() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("Funcionario");
		System.out.println("Digite as informações seguintes ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		System.out.print("RG: ");
		String rg = scan.nextLine();
		System.out.print("Telefone: ");
		String telefone = scan.nextLine();
		System.out.print("PIS: ");
		String pis = scan.nextLine();
		System.out.print("PASEP:");
		String pasep = scan.nextLine();
		System.out.print("Carteira Trabalho: ");
		String carteiraTrabalho = scan.nextLine();
		System.out.print("Salário: ");
		String salario = scan.nextLine();

		Funcionario func = new Funcionario(nome, cpf, rg, pis, pasep, carteiraTrabalho, salario);
		System.out.println("Deseja salvar o funcionário ("+cpf+")"+nome+"? S - Sim | N - Não");
		System.out.print("Resposta: ");
		String opc = scan.next();
		if(opc.equals("S")) {
			Funcionario.salvar(func);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Cadastros();
		scan.close();
	}

	private static void CadastroCliente1() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("");
		System.out.println("Cliente");
		System.out.println("Digite as informações seguintes");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome:");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("CPF:");
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		System.out.print("RG:");
		System.out.print("RG: ");
		String rg = scan.nextLine();
		System.out.print("Telefone:");
		System.out.print("Telefone: ");
		String telefone = scan.nextLine();

		Cliente clienteCadastro = new Cliente(nome, cpf, rg, telefone);
		
		
 private static void CadastroCliente() throws FileNotFoundException{
	}

	/*RELATÓRIOS*/
	private static void Relatorios() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("RELATORIOS");
}

	private static void showRelatorios() throws ClassNotFound, ClassNotFoundException, IOException{
		if (1 == opc) {
			List<Cliente> clientes = Cliente.lerClientes();
			System.out.println("Imprimindo clientes:");
			for (Cliente cliente: clientes) {
				System.out.println(cliente);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Cadastros();
		}else if (2 == opc) {
			List<Funcionario> funcionarios = Funcionario.lerTodosFuncionarios();
			System.out.println("Imprimindo funcionários:");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Relatorios();
		}else if(5 == opc) {
			Menu();
		}
			Thread.sleep(2000);{
				scan.close();
	
	}
}
} 



