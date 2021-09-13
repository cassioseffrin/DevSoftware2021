package br.unc.rener.interfaces;

import java.util.List;

public interface InterfaceSerializacaoGenerica {
	public <E> boolean salvarEntidade(E elemento, String arquivo);
	public <E> List<E> lerLista(String arquivo);
	public <E> boolean salvarLista(List<E> lstEntidades, String arquivo);
	public <E> List<E> criarListaVazia(String strArquivo);
}
