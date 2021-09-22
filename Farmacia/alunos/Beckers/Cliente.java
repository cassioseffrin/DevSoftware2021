package Lucas.Beckers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Pessoa {
	/* Attributes */
	private String telefone;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/cliente.csv";
	
	/* Getters */
	public String getTelefone() {
		return telefone;
	}
	
	/* Setters */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return super.toString()+";"+this.telefone;
	}
	
	@Override
	public void salvar() {
		try {
			File f = new File(Cliente.ARQUIVO);
			FileOutputStream fos = new FileOutputStream(f, true);
			String txt = this.toString()+"\n";
			fos.write(txt.getBytes());
			fos.close();
			System.out.println("Gravado com sucesso.");
		} catch (IOException e) {
			System.out.println("Erro ao gravar..");
		}
	}
	
	public static void lerTodos() {
		try {
			File f = new File(Cliente.ARQUIVO);
			FileInputStream fis;
			fis = new FileInputStream(f);
			Scanner scan = new Scanner(fis);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
			scan.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Erro ao ");
		}
	}
}
