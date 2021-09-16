package br.edu.nruchs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class AtvAplicativo {
	public static void main(String a[]) throws IOException {
		List<Funcionario> lstFunc = Funcionario.lerLista();
		for (Funcionario f : lstFunc) {
		System.out.println("Nome: " + f.getNome() + " CPF: " +f.getCpf());
		
		//Escrita 

		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileOutputStream fos = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(lstFunc);
		
		System.out.printf("É isto %s");
	}

}

	public class LeituraObjectSerializado {
		public static void main(String a[]) throws IOException, ClassNotFoundException {
			
			List<Funcionario> lstFunc = Funcionario.lerLista();
			for (Funcionario f : lstFunc) {
			System.out.println("Nome: " + f.getNome() + " CPF: " +f.getCpf());
			
			File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Funcionario funcDeserializado = (Funcionario) obj;
			System.out.println(funcDeserializado);
			List<Funcionario> lst = (List<Funcionario>) ois.readObject();

		}
	}
}
}