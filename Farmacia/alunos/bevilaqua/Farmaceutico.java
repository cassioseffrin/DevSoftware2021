package bruno.bevilaqua;

import java.util.List;

public class Farmaceutico extends Funcionario {
	/* Attributes */
	private static final long serialVersionUID = 1L;
	private String registroAnvisa;
	private static String ARQUIVO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/farmaceutico.csv";
	public static String ARQUIVO_SERIALIZACAO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/farmaceutico.obj";
	
	public Farmaceutico(String nome,String cpf, String rg,
			String pis, String pasep, String carteiraTrabalho, String salario,
			String registroAnvisa) {
		super(nome, cpf, rg, pis, pasep, carteiraTrabalho, salario);
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
	public static void salvar(Farmaceutico farm) {
		generico.salvarEntidade(farm, Farmaceutico.ARQUIVO_SERIALIZACAO);
	}
	
	public static List<Farmaceutico> lerTodosFarmaceuticos() {
		return generico.lerTodasEntidades(Farmaceutico.ARQUIVO_SERIALIZACAO);
	}
	
	public static void showFarmaceuticos() {
		generico.showLista(Farmaceutico.ARQUIVO_SERIALIZACAO);
	}

	/* Overrides */
	@Override
	public String toString() {
		return super.toString()+";"+this.registroAnvisa;
	}
}
