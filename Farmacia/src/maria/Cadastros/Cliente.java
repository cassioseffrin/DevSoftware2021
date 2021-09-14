package Cadastros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cliente extends Pessoa implements Serializable { 

	private static final long serialVersionUID = 1L;	
	public static final String ARQUIVO ="C:\\Users\\User\\eclipse-workspace\\Farmacia\\Database\\Cliente.csv";
	public static final String ARQUIVO_SERIAL = "C:\\Users\\User\\eclipse-workspace\\Farmacia\\Database\\Cliente.obj";

	private String telefone;
	
	
	public Cliente(String nome, String cpf, String rg, String endereco, String telefone) {
		super(nome, cpf, rg,endereco);
		this.telefone=telefone;
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getArquivo() {
		return ARQUIVO;
	}


	public static String getArquivoSerial() {
		return ARQUIVO_SERIAL;
	}


	public void salvar() {
		File f = new File(Cliente.ARQUIVO);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
 
			fos.write(this.toString().getBytes());
			System.out.println("O Objeto cliente foi salvo!");
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Caminho nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro de gravacao");
		}

	}
	
	public static List<Cliente> lerTodos() {
		File f = new File(ARQUIVO);
		FileInputStream fis;
		List<Cliente> lstClientes = new ArrayList<Cliente>();
		try {
			fis = new FileInputStream(f);
			Scanner scan = new Scanner(fis);
			while(scan.hasNext()) {
				String linha = scan.nextLine();
				String arr[] = linha.split(";");
				Cliente cliente = new Cliente(arr[0],arr[1],arr[2],arr[3],arr[4]);
				lstClientes.add(cliente);	
			}
			scan.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Caminho nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro de gravacao");
		}
		return lstClientes;
	}


	public String imprimir() {
		return super.toString() + ";" + this.telefone + "\n";
	}
	
		@Override
	public String toString()  {
		return String.format("Nome %s\nCPF: %s\nRG: %s\nFone: %s\nEndereco: %s\n ********************\n", 
				getNome(), getCpf(), getRg(), getTelefone(), getEndereco()) ;
	}

}
