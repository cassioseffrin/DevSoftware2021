package Azul;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Cadastros.Funcionario;

public class EntidadePersistente {
//+serializarEntidade ((E entidade, String arquivo))
	//+lerArquivoSerial(String arquivo)
	
	public void serealizarEntidade (E entidade, String arquivo) {
		
	}
	
	public static void lerArqSerialmain(String a[]) throws IOException, ClassNotFoundException (String arquivo) {
		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Funcionario entDeserializado = (Entidade) ois.readObject();;
		System.out.println(entDeserializado);
		
	}
	
}
