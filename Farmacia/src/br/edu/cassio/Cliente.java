package br.edu.cassio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cliente extends Pessoa {

	public static final String ARQUIVO = "/Users/cassioseffrin/dev/DevSoftware2021/Farmacia/database/Cliente.csv";

	private String telefone;

	public void setTelefone(String f) {
		this.telefone = f;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void salvar() {
		File f = new File(this.ARQUIVO);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(this.toString().getBytes());
			System.out.println("O objecto cliente foi salvo!");
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Caminho nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro de gravacao");
		}

	}

	@Override
	public String toString() {
		return super.toString() + ";" + this.telefone + "\n";
	}

}
