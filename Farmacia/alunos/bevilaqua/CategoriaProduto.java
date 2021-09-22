package bruno.bevilaqua;

import java.io.Serializable;
import java.util.List;

public class CategoriaProduto implements Serializable{
	public static Generico generico = new Generico();
	private String nome;
	private String icone;
	private static final long serialVersionUID = 1L;
	
	public static String ARQUIVO_SERIALIZACAO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/categoriaproduto.obj";
	
	public CategoriaProduto(String nome, String icone) {
		this.nome = nome;
		this.icone = icone;
	}
	
	/* Getters */
	public String getNome() {
		return this.nome;
	}
	
	public String getIcone() {
		return this.icone;
	}
	
	/* Setters */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIcone(String icone) {
		this.icone = icone;
	}
	
	/* Methods */
	public static void salvar(CategoriaProduto cp) {
		generico.salvarEntidade(cp, CategoriaProduto.ARQUIVO_SERIALIZACAO);
	}
	
	public static List<CategoriaProduto> lerTodosCategoriasProdutos() {
		return generico.lerTodasEntidades(CategoriaProduto.ARQUIVO_SERIALIZACAO);
	}

	public static void showCategoriasProdutos() {
		generico.showLista(CategoriaProduto.ARQUIVO_SERIALIZACAO);
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return "Nome: "+this.nome+" Icone: "+this.icone;
	}
}
