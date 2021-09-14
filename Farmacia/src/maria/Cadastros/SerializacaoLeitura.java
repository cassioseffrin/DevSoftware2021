package Cadastros;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializacaoLeitura {

	@SuppressWarnings("resource")
	public static void main(String a[]) throws IOException, ClassNotFoundException {
		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Funcionario funcDeserializado = (Funcionario) ois.readObject();;
		System.out.println(funcDeserializado);

	}
	
//	public <E> E lerSerial(String arquivo);
}


