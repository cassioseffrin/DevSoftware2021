package Farmacia;

import java.io.File;
import java.io.FileOutputStream;

public abstract class persistencia {
	
	public void salvar( String arquivo, String linha) {
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			
			fos.write(linha.get);
		}
	}
}

