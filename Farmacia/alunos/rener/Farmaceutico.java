package br.unc.rener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmaceutico extends Funcionario{
	
	public static final String ARQUIVO = "C:/DesenvolvimentoSoft/uncDesenvolvimento/Farmacia/database/Farmaceutico.csv";
	private String registroAnvisa;
	
	public String getRegistroAnvisa() {
		return registroAnvisa;
	}
	
	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	public void salvar() {
		File f = new File (this.ARQUIVO);
		try {		
		FileOutputStream fos = new FileOutputStream(f,true);
		fos.write(this.toString().getBytes());
		System.out.println("O objeto cliente foi salvo!");
		fos.close();
	}
		catch (FileNotFoundException fnf) {
			System.out.println("Caminho não encontrado");
		}catch (IOException e) {
			System.out.println("Erro de gravação");
		}
	}
	
}
