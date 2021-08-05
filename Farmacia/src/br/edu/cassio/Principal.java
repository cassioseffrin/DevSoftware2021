package br.edu.cassio;

public class Principal {
	
	public static void main(String a[]) {
		Cliente c = new Cliente();
		c.setNome("Maria");
		c.setTelefone("3442-4521");
		System.out.println("Nome: " + c.getNome());
		System.out.println("Telefone: " + c.getTelefone());
	}

}
