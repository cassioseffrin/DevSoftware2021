package ui;

import java.util.List;
import java.util.Scanner;

import br.edu.cassio.dao.ClienteDao;
import br.edu.cassio.models.Cliente;
import br.edu.cassio.models.Funcionario;
import br.edu.cassio.utils.EntidadeGenerica;

public class Principal {

	private static ClienteDao clienteDao = new ClienteDao();

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
		System.out.printf("Digite uma das opçção acima: ");
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
		System.out.printf("Digite uma das opçção acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 5) {
			montaTelaPrincipal();
		} else if (op == 1) {
			menuCliente();
		} else if (op == 2) {
			cadastroFuncionario();
		}
	}

	private static void menuCliente() {
		System.out.println("\f CLIENTE\n\n\n");
		System.out.println("1. INSERIR");
		System.out.println("2. ALTERAR");
		System.out.println("3. VOLTAR");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			cadastroCliente();
		} else if (op == 2) {

			alterarCliente();

		} else if (op == 3) {
			irMenuCadastro();
		}
	}

	private static void alterarCliente() {
		System.out.println("ALTERAÇAO DE CLIENTE \n\n\n");
		System.out.println("DIGITE O ID DO CLIENTE: \n");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Cliente c = clienteDao.buscar(id);
		System.out.println("O cliente a ser alterado é: \n" + c);
		System.out.println("Nome: ");
		c.setNome(scanner.next());
		
		System.out.println("CPF");
		c.setCpf(scanner.nextLine());
		System.out.println("RG");
		c.setRg(scanner.nextLine());
		System.out.println("Telefone");
		c.setTelefone(scanner.nextLine());
		System.out.println("Endereco");
		c.setEndereco(scanner.nextLine());

 
		clienteDao.alterar(c);

		try {
			Thread.sleep(2000);
			montaTelaPrincipal();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}


	}

	private static void irMenuRelatorio() {

		System.out.println("\f RELATORIOS\n\n\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n\n\n");
		System.out.printf("Digite uma das opçção acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			relatorioCliente();
		} else if (op == 2) {
			relatorioFuncionario();
		}
	}

	private static void relatorioCliente() {
		System.out.println("LISTAGEM CLIENTES \n\n\n");
		List<Cliente> lst = clienteDao.listar();
		for (Cliente c : lst) {
			System.out.println(c);
		}
	}

	private static void relatorioFuncionario() {
		System.out.println("IMPRIMINDO Funcionario \n\n\n");

		EntidadeGenerica e = new EntidadeGenerica();
		e.imprimirLista(Funcionario.ARQUIVO_SERIAL);

		System.out.println("\n\n Digite uma op 1 : Menu - 2 : Relatorios");
		Scanner f = new Scanner(System.in);
		Integer op = f.nextInt();
		if (op == 1) {
			montaTelaPrincipal();
		} else if (op == 2) {
			irMenuRelatorio();
		}
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

		clienteDao.inserir(c);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}

		montaTelaPrincipal();

	}

	private static void cadastroFuncionario() {
		Scanner l = new Scanner(System.in);
		Funcionario f = new Funcionario();
		System.out.println("CADASTRANDO Funcionario \n\n\n");

		System.out.println("Funcionario: ");
		f.setNome(l.nextLine());
		System.out.println("CPF");
		f.setCpf(l.nextLine());
		System.out.println("RG");
		f.setRg(l.nextLine());
		System.out.println("Endereco");
		f.setEndereco(l.nextLine());
		System.out.println("pis");
		f.setPis(l.nextLine());
		System.out.println("pasep");
		f.setPasep(l.nextLine());
		System.out.println("carteiraTrabalho");
		f.setCarteiraTrabalho(l.nextLine());
		System.out.println("salario");
		f.setSalario(l.nextDouble());

		EntidadeGenerica e = new EntidadeGenerica();
		e.salvarEntidade(f, Funcionario.ARQUIVO_SERIAL);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}

		montaTelaPrincipal();

	}

}