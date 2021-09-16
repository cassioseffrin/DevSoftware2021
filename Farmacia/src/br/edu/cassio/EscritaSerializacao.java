package br.edu.cassio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscritaSerializacao {
	public static void main(String a[]) throws IOException {

		Funcionario f = new Funcionario();
		f.setNome("Natalia");
		f.setCpf("234634535");
		f.setRg("234234234");
		f.setPis("234234");
		f.setPasep("2342349686");
		f.setSalario(24234.45);
		f.setCarteiraTrabalho("FA2234");

		File arquivo = new File(Funcionario.ARQUIVO_SERIAL);
		FileOutputStream fos = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(f);
		
		
		

	}
	
	
//	public <E> boolean serializarEntidade(  E entidade, String arquivo);
	

}
