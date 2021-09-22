package bruno.bevilaqua;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		showMenu();
	}

	private static void showMenu() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|            Sistema Farmacêutico              |");
		System.out.println("|______________________________________________|");
		System.out.println("|1. Sair                                       |");
		System.out.println("|2. Cadastro                                   |");
		System.out.println("|3. Estoque                                    |");
		System.out.println("|4. Relatórios                                 |");
		System.out.print("Digite uma opção: ");
		Scanner scan = new Scanner(System.in);
		Integer opc = scan.nextInt();
		if (2 == opc) {
			showCadastros();
		}else if (4 == opc) {
			showRelatorios();
		}
		scan.close();
	}

	private static void showCadastros() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|                 Cadastros                    |");
		System.out.println("|______________________________________________|");
		System.out.println("|1. Voltar                                     |");
		System.out.println("|2. Cliente                                    |");
		System.out.println("|3. Funcionario                                |");
		System.out.println("|4. Farmaceutico                               |");
		System.out.println("|5. Cat. Produto                               |");
		System.out.print("Digite uma opção: ");
		Scanner scan = new Scanner(System.in);
		Integer opc = scan.nextInt();
		if (1 == opc) {
			showMenu();
		}else if (2 == opc){
			showCadastroCliente();
		}else if (3 == opc) {
			showCadastroFuncionario();
		}else if (4 == opc) {
			showCadastroFarmaceutico();
		}else if(5 == opc) {
			showCadastroCategoriaProduto();
		}
		scan.close();
		
	}
	
	/*
	 * Cadastros
	 * */
	
	private static void showCadastroProduto() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|               Produto                        |");
		System.out.println("|__Digite______________________________________|");
		Scanner scan = new Scanner(System.in);
		System.out.print("Código Barra: ");
		String codBarra = scan.nextLine();
		System.out.print("Lote: ");
		String lote = scan.nextLine();
		System.out.println("Data Fabricação: ");
		String data_fabricacao = scan.nextLine();
		System.out.println("Data Validade: ");
		String data_validade = scan.nextLine();
		System.out.println("Valor: ");
		Float valor = scan.nextFloat();
		System.out.println("Idade Mínima: ");
		Integer idadeMinima = scan.nextInt();
		System.out.println("Idade Máxima: ");
		Integer idadeMaxima = scan.nextInt();
		System.out.println("Nome da Categoria do Produto: ");
		String nomeCatProd = scan.nextLine();
		System.out.println("Ícone da categoria do produto: ");
		String iconeCatProd = scan.nextLine();
	
		Date dataFabricacao = new Date(Integer.parseInt(data_fabricacao.split("/")[2]),Integer.parseInt(data_fabricacao.split("/")[1]), Integer.parseInt(data_fabricacao.split("/")[0]));
		Date dataValidade= new Date(Integer.parseInt(data_validade.split("/")[2]),Integer.parseInt(data_validade.split("/")[1]), Integer.parseInt(data_validade.split("/")[0]));
		
		CategoriaProduto catprod = new CategoriaProduto(nomeCatProd, iconeCatProd);
		Produto produto = new Produto(codBarra, lote, dataFabricacao, dataValidade, valor, idadeMinima, idadeMaxima, catprod);
		
		System.out.println("Deseja salvar o produto? S - Sim | N - Não");
		System.out.print("Resposta: ");
		String opc = scan.next();
		if(opc.equals("S")) {
			produto.salvar(produto);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showCadastros();
		scan.close();
	}
	
	private static void showCadastroCategoriaProduto() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|               Cat. Produto                   |");
		System.out.println("|__Digite______________________________________|");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("Ícone: ");
		String icone = scan.nextLine();
		
		CategoriaProduto catprod = new CategoriaProduto(nome, icone);
		System.out.println("Deseja salvar a categoria de produto "+catprod.getNome()+"? S - Sim | N - Não");
		System.out.print("Resposta: ");
		String opc = scan.next();
		if(opc.equals("S")) {
			CategoriaProduto.salvar(catprod);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showCadastros();
		scan.close();
	}
	
	private static void showCadastroFuncionario() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|               Funcionario                    |");
		System.out.println("|__Digite______________________________________|");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		System.out.print("RG: ");
		String rg = scan.nextLine();
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
		showCadastros();
		scan.close();
	}
	
	private static void showCadastroCliente() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|                 Cliente                      |");
		System.out.println("|__Digite______________________________________|");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		System.out.print("RG: ");
		String rg = scan.nextLine();
		System.out.print("Telefone: ");
		String telefone = scan.nextLine();
		
		Cliente clienteCadastro = new Cliente(nome, cpf, rg, telefone);
		System.out.println("Deseja salvar o cliente ("+cpf+")"+nome+"? S - Sim | N - Não");
		System.out.print("Resposta: ");
		String opc = scan.next();
		if(opc.equals("S")) {
			Cliente.salvar(clienteCadastro);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showCadastros();
		scan.close();
	}
	
	private static void showCadastroFarmaceutico() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|               Farmaceutico                   |");
		System.out.println("|__Digite______________________________________|");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		System.out.print("RG: ");
		String rg = scan.nextLine();
		System.out.print("PIS: ");
		String pis = scan.nextLine();
		System.out.print("PASEP:");
		String pasep = scan.nextLine();
		System.out.print("Carteira Trabalho: ");
		String carteiraTrabalho = scan.nextLine();
		System.out.print("Salário: ");
		String salario = scan.nextLine();
		System.out.print("Anvisa: ");
		String anvisa = scan.nextLine();
		
		Farmaceutico farmaceuticoCadastro = new Farmaceutico(nome, cpf, rg, pis, pasep, carteiraTrabalho, salario, anvisa);
		System.out.println("Deseja salvar o farmaceutico ("+cpf+")"+nome+"? S - Sim | N - Não");
		System.out.print("Resposta: ");
		String opc = scan.next();
		if(opc.equals("S")) {
			Farmaceutico.salvar(farmaceuticoCadastro);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showCadastros();
		scan.close();
	}
	
	/**
	 * Relatórios
	 */
	
	private static void showRelatorios() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println("________________________________________________");
		System.out.println("|                 Relatórios                   |");
		System.out.println("|______________________________________________|");
		System.out.println("|1. Voltar                                     |");
		System.out.println("|2. Cliente                                    |");
		System.out.println("|3. Funcionario                                |");
		System.out.println("|4. Farmaceutico                               |");
		System.out.println("|5. Cat. Produto                               |");
		System.out.println("|6. Produto                                    |");
		System.out.print("Digite uma opção: ");
		Scanner scan = new Scanner(System.in);
		Integer opc = scan.nextInt();
		if(1 == opc) {
			showMenu();
		} else if (2 == opc) {
			Cliente.showAll();
		}else if (3 == opc) {
			Funcionario.showFuncionarios();
		}else if(4 == opc) {
			Farmaceutico.showFarmaceuticos();
		}else if (5 == opc) {
			CategoriaProduto.showCategoriasProdutos();
		}
		if(1 != opc) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			showRelatorios();
		}
		scan.close();
		
	}
}
