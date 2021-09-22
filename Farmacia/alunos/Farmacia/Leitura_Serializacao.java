package Farmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leitura_Serializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Funcionario funcDescerializado = (Funcionario) obj;
		System.out.print(funcDescerializado);
	}

}