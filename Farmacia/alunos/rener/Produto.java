package br.unc.rener;

public class Produto extends CategoriaProduto {
	
	private String codBarra;
	private String lote;
	private String dataFabricacao;
	private String dataValidade;
	private String valor;
	private String idadeMinima;
	private String idadeMaxima;
	
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
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(String idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public String getIdadeMaxima() {
		return idadeMaxima;
	}
	public void setIdadeMaxima(String idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}
}
