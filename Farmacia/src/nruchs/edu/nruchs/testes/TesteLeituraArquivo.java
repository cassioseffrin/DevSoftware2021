package br.edu.nruchs.testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeituraArquivo {
	
	public static void main(String a[]) throws IOException {
		
		File f = new File("/Users/cassioseffrin/teste.txt");
		FileInputStream fis = new FileInputStream(f);
		Scanner scan = new Scanner(fis);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		fis.close();
		scan.close();
	}

}
