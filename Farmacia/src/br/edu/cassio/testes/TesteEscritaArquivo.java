package br.edu.cassio.testes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaArquivo {
	public static void main(String a[]) throws IOException {
		File f = new File("/Users/cassioseffrin/teste.txt");
		FileOutputStream fos = new FileOutputStream(f, false);
		String texto = "AULA 5";
		fos.write(texto.getBytes());
		fos.close();
	}

}
