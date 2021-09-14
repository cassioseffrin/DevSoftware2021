package Cadastros;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializacaoEscrita {
	@SuppressWarnings("resource")
	public static void main(String a[]) throws IOException {

		Funcionario f = new Funcionario();
		f.setNome("Natalia");
		f.setCpf("234634535");
		f.setRg("234234234");
		f.setPis("234234");
		f.setPasep("2342349686");
		f.setSalario(24234.45);
		f.setCarteiraTrabalho("FA2234");

		File arquivo = new File(Funcionario.ARQUIVO_SERIALIZACAO);
		FileOutputStream fos = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(f);
		
		
		

	}
}


