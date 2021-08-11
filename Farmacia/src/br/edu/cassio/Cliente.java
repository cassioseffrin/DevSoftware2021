package br.edu.cassio;

public class Cliente extends Pessoa{
	
	
	private static String ARQUIVO = "/Users/cassioseffrin/dev/DevSoftware2021/Farmacia/database/Cliente.csv";
	
	private String telefone;
	
	
	public void setTelefone(String f) {
		this.telefone = f;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

	public void salvar() {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public String toString() {
		return super.toString() + ";" + this.telefone;
	}

}
