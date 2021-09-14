package br.unc.rener.testes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaArquivo {
	public static void main (String a []) throws IOException {
		
		File f = new File ("c:/DesenvolvimentoSoft/uncDesenvolvimento/teste.txt");		
		FileOutputStream fos = new FileOutputStream(f,true);
		String texto = "teste";
		fos.write(texto.getBytes());
		fos.close();
     }
}
