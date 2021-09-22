package br.unc.rener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscritaSerializacao {
	public static void main(String a[]) throws IOException {

		Funcionario f = new Funcionario();

		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileOutputStream fos = new FileOutputStream(arquivo);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
		oos.writeObject(f);
		}

	}
}