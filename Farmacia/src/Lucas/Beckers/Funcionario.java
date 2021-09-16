package Lucas.Beckers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Funcionario extends Pessoa{
	/* Attributes */
	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	private String salario;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/funcionario.csv";
	
	/* Getters */
	public String getPis() {
		return this.pis;
	}
	
	public String getPasep() {
		return this.pasep;
	}
	
	public String getCarteiraTrabalho() {
		return this.carteiraTrabalho;
	}
	
	public String getSalario() {
		return this.salario;
	}
	
	/* Setters */
	public void setPis(String pis) {
		this.pis = pis;
	}
	
	public void setPasep(String pasep) {
		this.pasep = pasep;
	}
	
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return super.toString()+";"+this.pis+";"+this.pasep+";"+this.carteiraTrabalho+";"+this.salario;
	}
	
	@Override
	public void salvar() {
		try {
			File f = new File(Funcionario.ARQUIVO);
			FileOutputStream fos = new FileOutputStream(f, true);
			String txt = this.toString()+"\n";
			fos.write(txt.getBytes());
			fos.close();
			System.out.println("Gravado com sucesso.");
		} catch (IOException e) {
			System.out.println("Erro ao gravar..");
		}
	}
	
	public static void lerTodos() {
		try {
			File f = new File(Funcionario.ARQUIVO);
			FileInputStream fis;
			fis = new FileInputStream(f);
			Scanner scan = new Scanner(fis);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
			scan.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Erro ao ");
		}
	}
}
