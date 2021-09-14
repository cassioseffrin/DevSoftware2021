package bruno.bevilaqua;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Produto implements Serializable{
	/**
	 * 
	 */
	public static Generico generico = new Generico();
	
	private static final long serialVersionUID = 1L;
	private String codBarra;
	private String lote;
	private Date dataFabricacao;
	private Date dataValidade;
	private Float valor;
	private Integer idadeMinima;
	private Integer idadeMaxima;
	private CategoriaProduto categoriaProduto;
	
	public static String ARQUIVO_SERIALIZACAO = "C:/bruno/UNC/2_fase/desenvolvimento_software/unc_DevSoftware2021/farmacia/database/produto.obj";
	
	public Produto(String codBarra, String lote, Date dataFabricacao, Date dataValidade, Float valor, Integer idadeMinima, Integer idadeMaxima, CategoriaProduto categoriaproduto) {
		this.setCodBarra(codBarra);
		this.setLote(lote);
		this.setDataFabricacao(dataFabricacao);
		this.setDataValidade(dataValidade);
		this.setValor(valor);
		this.setIdadeMinima(idadeMinima);
		this.setIdadeMaxima(idadeMaxima);
		this.setCategoriaProduto(categoriaproduto);
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(Integer idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(Integer idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}
	
	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	
	/* Methods */
	public static void salvar(Produto cl) {
		generico.salvarEntidade(cl, Produto.ARQUIVO_SERIALIZACAO);
	}
	
	public static List<Produto> lerTodos() throws ClassNotFoundException {
		return generico.lerTodasEntidades(Produto.ARQUIVO_SERIALIZACAO);
	}
	
	public static void showAll() {
		generico.showLista(Produto.ARQUIVO_SERIALIZACAO);
	}
	
	/* Overrides */
	@Override
	public String toString() {
		return "Cód. Barra: "+this.codBarra+" Lote: "+this.lote+" Fab.: "+this.dataFabricacao.toString()
			+" Validade: "+this.dataValidade.toString()+" Valor: "+this.valor
			+" Idade Mínima: "+this.idadeMinima+ " idade Máxima: "+this.idadeMaxima;
	}
}
