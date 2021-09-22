package bruno.bevilaqua;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Serializable {
	/**
	 * 
	 */
	protected static Generico generico = new Generico();
	private static final long serialVersionUID = 1L;
	/* Attributes */
	private String nome;
	private String cpf;
	private String rg;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/pessoa.csv";
	
	/* Constructor */
	public Pessoa (String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf= cpf;
		this.rg = rg;
	}

	/* Getters */
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getRg() {
		return this.rg;
	}

	/* Setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return "Nome: "+this.nome+" CPF: "+this.cpf+" RG:"+this.rg;
	}

}