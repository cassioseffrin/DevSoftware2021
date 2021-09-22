package userinterface;

import java.util.Scanner;

import br.edu.nruchs.Cliente;

public class Principal {

	public static void main(String array[]) {
		
		montaTelaPrincipal();
	}
	
	private static void montaTelaPrincipal() {
		
		System.out.println("SISTEMA FARMACEUTICO FARM UNC\n");
		System.out.println("1. CADASTRO");
		System.out.println("2. ESTOQUE");
		System.out.println("3. RELATORIO");
		System.out.println("4. AJUDA");
		System.out.println("5. SAIR\n");
		System.out.println("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		
		irTela(op);	
	}
	
	private static void irTela (Integer op) {
		
		if(op==1) {
			irMenuCadastro();
		}
		
	}
		
	private static void irMenuCadastro() {
		
		System.out.println("CADASTROS\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n");
		System.out.println("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		
		if(op==1) {
			irMenuCliente();
		}
		if (op==5) {
			montaTelaPrincipal();
		}
		
	}
	
	private static void irMenuCliente() {
		
		System.out.println("CADASTRO DE CLIENTE\n");
		
		Cliente c = new Cliente();
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		c.setNome(scan.nextLine());
		System.out.print("Digite o CPF: ");
		c.setCpf(scan.nextLine()); 
		System.out.print("Digite o RG: ");
		c.setRg(scan.nextLine()); 
		System.out.print("Digite o Endereço: ");
		c.setEndereco(scan.nextLine());
		c.salvar(); scan.close();
				
		System.out.println("Nome: "+c.getNome()+" CPF: "+c.getCpf()+" RG: "+c.getRg()+ " Endereço: "+c.getEndereco());
		
	}
}