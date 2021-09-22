package Farmacia;
import java.util.List;

public interface InterfaceSerializacaoGenerica {

	public <E> boolean serializarListaEntidade(List<E> lstEntidades, String arquivo);
	public <E> boolean salvarEntidade(E elemento, String arquivo);
	public <E> List<E> lerLista(String arquivo);
	public <E> boolean salvarLista(List<E> lstEntidades, String arquivo);
	public <E> List<E> criarListaVazia(String strArquivo);

	public <E> boolean serializarEntidade(  E entidade, String arquivo);

	public <E> E lerSerial(String arquivo);

	public <E> boolean adicioarElementoLista(E elemento, String arquivo);

	public <E> List<E> lerListaSerial(String arquivo);

	/*public <E> boolean gravarArquivoCSV(E entidade, String arquivo);
	public <E> boolean serializarEntidade(  E entidade, String arquivo);
	public <E> E lerObjeto(String arquivo);
	public <E> List<E> lerListaSerial(String arquivo);
	public <E> boolean gravarArquivoCSV(E entidade, String arquivo);*/

}