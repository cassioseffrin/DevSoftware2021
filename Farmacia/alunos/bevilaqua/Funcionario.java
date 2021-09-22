package bruno.bevilaqua;

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

public class Funcionario extends Pessoa{
	private static final long serialVersionUID = 1L;
	/* Attributes */
	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	private Double salario;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/funcionario.csv";
	public static String ARQUIVO_SERIALIZACAO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/funcionario.obj";
	
	/* Constructor */
	public Funcionario (String nome,String cpf, String rg,
			String pis, String pasep, String carteiraTrabalho, String salario) {
		super(nome, cpf, rg);
		this.pis = pis;
		this.pasep = pasep;
		this.carteiraTrabalho = carteiraTrabalho;
		this.salario = Double.parseDouble(salario);
	}
	
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
	
	public Double getSalario() {
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
		this.salario = Double.parseDouble(salario);
	}
	
	/* Methods */
	public static void salvar(Funcionario func) {
		generico.salvarEntidade(func, Funcionario.ARQUIVO_SERIALIZACAO);
	}
	
	public static List<Funcionario> lerTodosFuncionarios() {
		return generico.lerTodasEntidades(Funcionario.ARQUIVO_SERIALIZACAO);
	}
	
	public static void showFuncionarios() {
		generico.showLista(Funcionario.ARQUIVO_SERIALIZACAO);
	}
	
	/* Overrides */
	public String toString() {
		return super.toString()+" PIS:"+this.pis+" PASEP:"+this.pasep+" Carteira Trabalho:"+this.carteiraTrabalho+" Salário:"+this.salario;
	}
}
