package maria.Cadastros;

public class Farmaceutico extends Funcionario{

	public Farmaceutico(String[] a) {
		super(a);
		// TODO Auto-generated constructor stub
	}


	private static final long serialVersionUID = 1L;
	private String registroAnvisa;

	public String getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	

@Override
public String toString() {
	return super.toString()+ ";"+ this.registroAnvisa;
}

}
