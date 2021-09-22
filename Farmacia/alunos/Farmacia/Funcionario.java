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
import java.util.Scanner;

public class Funcionario extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	private Double salario;
	private static String ARQUIVO = "C:\\Users\\USER\\Documents\\DevSoftware2021\\Farmacia\\src\\Farmacia\\Funcionario.java";
	public static String ARQUIVO_SERIALIZACAO = "";

	public Funcionario() {
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