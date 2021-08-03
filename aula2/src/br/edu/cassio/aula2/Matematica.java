package br.edu.cassio.aula2;
/**
 *
 * @author Cassio Seffrin
 */

class Matematica  implements InterfaceMatematica {

	public float somar(float n1, float n2) {
		return n1 + n2;
	}

	public float subtrair(float n1, float n2) {
		return n1 - n2;
	}
	
	public float multiplicar(float a, float b) {
		return a * b;
	}
	
	
	public float dividir(float n1, float n2) {
		return n1 / n2;
	}
	
	public double raiz(float n) {
		return Math.sqrt(n);
	}
}
