package Cadastros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Persistencia {
	
	public void salvar( String arquivo, String linha) {
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
 
			fos.write(linha.getBytes());
			System.out.println("O Objeto foi salvo!");
			fos.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Caminho nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro de gravacao");
		}

	}
}
