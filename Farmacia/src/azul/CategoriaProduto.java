package azul;

public class CategoriaProduto extends Produto {
	
	private String nome;
	private String icone;

	public CategoriaProduto(String codBarra, String lote, String dataFabricacao, String dataValidade, String valor,
			String idadeMinima, String idadeMaxima, String nome, String icone) {
		super(codBarra, lote, dataFabricacao, dataValidade, valor, idadeMinima, idadeMaxima);
		this.nome = nome; 
		this.icone = icone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

}
