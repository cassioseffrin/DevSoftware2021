package Cadastros;

import java.io.Serializable;

public class Pessoa  extends Persistencia implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	
	public Pessoa() {}

	public Pessoa(String nome, String cpf, String rg, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.nome + ";" + this.cpf + ";" + this.rg + ";" + this.endereco;
	}
}
		
