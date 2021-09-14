package Lucas.Beckers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Farmaceutico extends Funcionario{
	/* Attributes */
	private String registroAnvisa;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/farmaceutico.csv";
	
	/* Getters */
	public String getRegistroAnvisa() {
		return registroAnvisa;
	}
	
	/* Setters */
	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return super.toString()+";"+this.registroAnvisa;
	}
	
	@Override
	public void salvar() {
		try {
			File f = new File(Farmaceutico.ARQUIVO);
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
			File f = new File(Farmaceutico.ARQUIVO);
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
