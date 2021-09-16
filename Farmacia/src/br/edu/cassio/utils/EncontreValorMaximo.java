package br.edu.cassio.utils;

/**
 *
 * @author Cassio Seffrin
 */
public class EncontreValorMaximo {
	// determina o maior dos 3 objetos Comparable
	public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
		// assume que x eh inicialmente o maior
		T max = x; 
		// y eh o maior ate agora
		if (y.compareTo(max) > 0)
			max = y; 
		// z e o maior
		if (z.compareTo(max) > 0)
			max = z; 
		// retorna o maior objeto
		return max; 
	}

	public static void main(String args[]) {
		
		
		System.out.printf("O Maximo de %d, %d e %d eh  %d\n\n", 3, 4, 5, maximo(3, 4, 5));
		System.out.printf("O Maximo de %.1f, %.1f e %.1f eh  %.1f\n\n", 6.6, 8.8, 7.7, maximo(6.6, 8.8, 7.7));
		System.out.printf("O Maximo de %s, %s e %s eh  %s\n", "banana", "maca", "laranja",
				maximo("banana", "maca", "laranda"));
		
		
		  
	}
}
