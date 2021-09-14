package br.edu.nruchs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmaceutico extends Funcionario{
	
	public static final String ARQUIVO = "D:\\Git\\DevSoftware2021-Natty\\Farmacia\\src";
	
	private String registroAnvisa;
	
	public Farmaceutico(String nome,String cpf, String rg,
			String pis, String pasep, String carteiraTrabalho, String salario,
			String registroAnvisa) {
		super (nome, cpf, rg, pis, pasep, carteiraTrabalho, salario);
		this.registroAnvisa = registroAnvisa;
	}
	
	/* Getters */
	public String getRegistroAnvisa() {
		return registroAnvisa;
	}
	
	/* Setters */
	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	
	/* Methods */
	public List<Farmaceutico> lerTodosFarmaceuticos() {
		List<Farmaceutico> lstFarmaceuticos = new ArrayList<Farmaceutico>();
		List<String[]> lstGeneric = Genericos.lerArquivo(Farmaceutico.ARQUIVO);
		for (String[] g : lstGeneric) {
			Farmaceutico farmaceuticoAtual = new Farmaceutico(g[0], g[1], g[2], g[3], g[4], g[5], g[6], g[7]);
			lstFarmaceuticos.add(farmaceuticoAtual);
		}
		return lstFarmaceuticos;
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return super.toString()+";"+this.registroAnvisa;
	}
	
	@Override
	public void salvar() {
		Genericos.escreverArquivo(Farmaceutico.ARQUIVO, this);
	}
}