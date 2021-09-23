package br.edu.cassio.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa implements Serializable,Comparable<Object> {

	private static final long serialVersionUID = 2L;

	public static final String ARQUIVO = "/Users/cassioseffrin/dev/DevSoftware2021/Farmacia\\database\\Funcionario.csv";
	public static final String ARQUIVO_SERIAL = "/Users/cassioseffrin/dev/DevSoftware2021/Farmacia\\database\\Funcionario.obj";

	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	private Double salario;

	public Funcionario() {
	};
	@Override
	public int compareTo(Object o) {
		Cliente e = (Cliente) o;
	
		return this.getNome().compareTo(e.getNome());
	
	}
	
	public Funcionario(String nome, String cpf, String rg, String endereco, String pis, String pasep, String carteiraTrabalho, Double salario) {
		super(nome, cpf, rg, endereco);
		this.pis=pis;
		this.pasep=pasep;
		this.carteiraTrabalho=carteiraTrabalho;	 
		this.salario=salario;
	}

	public Funcionario(String a[]) { 
		super(a[0],a[1],a[2],a[3]); 
		this.pis=(a[4]);
		this.pasep= (a[5]);
		this.carteiraTrabalho=(a[6]);	 
		this.salario=  Double.parseDouble(a[7]);
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public String getPasep() {
		return pasep;
	}

	public void setPasep(String pasep) {
		this.pasep = pasep;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static String getArquivo() {
		return ARQUIVO;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + getPis() + ";" + getPasep() + ";" + getCarteiraTrabalho() + ";" + getSalario()
				+ "\n";
	}

	public static List<Funcionario> lerLista() {
		File f = new File(ARQUIVO);
		FileInputStream fis;
		List<Funcionario> lstFuncionario = new ArrayList<Funcionario>();
		try {
			fis = new FileInputStream(f);
			Scanner scan = new Scanner(fis);
			while (scan.hasNext()) {
				String linha = scan.nextLine();
				String arr[] = linha.split(";");
				Funcionario func = new Funcionario(arr);
				lstFuncionario.add(func);
			}
			scan.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Caminho nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro de gravacao");
		}
		return lstFuncionario;
	}

}
