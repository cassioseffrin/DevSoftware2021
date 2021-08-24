package br.edu.cassio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeituraObjectSerializado {
	public static void main(String a[]) throws IOException, ClassNotFoundException {
		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Funcionario funcDeserializado = (Funcionario) obj;
		System.out.println(funcDeserializado);

	}
}
