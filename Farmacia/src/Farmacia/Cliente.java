package Farmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Farmacia.Funcionario;


public class Cliente extends Pessoa implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private String telefone;
	private static String ARQUIVO = "";
	public static String ARQUIVO_SERIALIZACAO = "";
	
	
	public Cliente (String nome, String cpf, String rg, String telefone) {
		super();
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;}
	

	public static void salvar(Cliente cl) throws IOException, FileNotFoundException, ClassNotFoundException {
		List<Cliente> clieList = Cliente.lerClientes();
		clieList.add(cl);
		File f = new File(Cliente.ARQUIVO_SERIALIZACAO);

		FileOutputStream fos = new FileOutputStream(f);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(clieList);
		}
		System.out.println("O cliente foi salvo!");
	}

	public static List<Cliente> lerClientes() throws IOException, FileNotFoundException, ClassNotFoundException {
		
	public static List<Cliente> lerClientes() throws ClassNotFoundException {
		File f = new File(Cliente.ARQUIVO_SERIALIZACAO);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (List<Cliente>) ois.readObject();
		FileInputStream fis;
		try {
			try {
				fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				return (List<Cliente>) ois.readObject();
			} catch (FileNotFoundException e) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				List<Cliente> cl = new ArrayList();
				return cl;
			}
		} catch (IOException e) {
			List<Cliente> cl = new ArrayList();
			return cl;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" Telefone: "+this.telefone;
		return super.toString()+" Telefone:"+this.telefone;
	}
}
}