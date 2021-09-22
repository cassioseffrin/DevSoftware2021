package Farmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmaceutico extends Funcionario{

	private String registroAnvisa;
	private static String ARQUIVO = "";
	
	public Farmaceutico(String nome,String cpf, String rg,
			String pis, String pasep, String carteiraTrabalho, String salario,
			String registroAnvisa) {
		super(nome, cpf, rg, pis, pasep, carteiraTrabalho, salario);
		this.registroAnvisa = registroAnvisa;
	}
	
	public String getRegistroAnvisa() {
		return registroAnvisa;
	}
	
	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	
	public List<Farmaceutico> lerTodosFarmaceuticos() {
		List<Farmaceutico> lstFarmaceuticos = new ArrayList<Farmaceutico>();
		List<String[]> lstGeneric = genericos.lerArquivo(Farmaceutico.ARQUIVO);
		for (String[] g : lstGeneric) {
			Farmaceutico farmaceuticoAtual = new Farmaceutico(g[0], g[1], g[2], g[3], g[4], g[5], g[6], g[7]);
			lstFarmaceuticos.add(farmaceuticoAtual);
		}
		return lstFarmaceuticos;
	}
	
	@Override
	public String toString() {
		return super.toString()+";"+this.registroAnvisa;
	}
	
	@Override
	public void salvar() {
		genericos.escreverArquivo(Farmaceutico.ARQUIVO, this);
	}
}