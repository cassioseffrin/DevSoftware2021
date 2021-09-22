package Farmacia;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;

	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String n) {
		this.cpf = n;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setRG(String n) {
		this.rg = n;
	}
	public String getRG() {
		return this.rg;
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
