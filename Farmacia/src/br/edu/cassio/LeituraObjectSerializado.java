package br.edu.cassio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.edu.cassio.models.Funcionario;

public class LeituraObjectSerializado {
	public static void main(String a[]) throws IOException, ClassNotFoundException {
		File arquivo = new File(Funcionario.ARQUIVO_SERIAL);
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Funcionario funcDeserializado = (Funcionario) ois.readObject();;
		System.out.println(funcDeserializado);

	}
	
//	public <E> E lerSerial(String arquivo);
}
