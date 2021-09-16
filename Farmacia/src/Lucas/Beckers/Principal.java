package Lucas.Beckers;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		//pessoa.lerTodos();
		
		Cliente p = new Cliente();
		System.out.print("Digite seu nome: ");
		p.setNome(scan.nextLine());
		System.out.print("Digite seu CPF: ");
		p.setCpf(scan.nextLine());
		System.out.print("Digite seu RG: ");
		p.setRg(scan.nextLine());
		System.out.print("Digite seu telefone: ");
		p.setTelefone(scan.nextLine());
		

		p.salvar();
		scan.close();
	}

}
