package Azul;

import java.util.Date;

public class Produto {

	public static final String ARQUIVO_SERIAL = null;
	private String codBarra;
	private String lote;
	private String dataFabricacao;
	private String dataValidade;
	private float valor;
	private float iMin;
	private float iMax;

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarraString) {
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

	public void setDataFabricacao(String string) {
		this.dataFabricacao = string;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String string) {
		this.dataValidade = string;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getiMin() {
		return iMin;
	}

	public void setiMin(float iMin) {
		this.iMin = iMin;
	}

	public float getiMax() {
		return iMax;
	}

	public void setiMax(float iMax) {
		this.iMax = iMax;
	}

}
