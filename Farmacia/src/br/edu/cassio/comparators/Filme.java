package br.edu.cassio.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Cassio Seffrin
 */
public class Filme implements Comparable<Filme> {
	private double nota;
	private String nome;
	private int ano;

	// servira para ordenar
	public int compareTo(Filme m) {
		return this.ano - m.ano;
	}

	public Filme(String nome, double nota, int ano) {
		this.nome = nome;
		this.nota = nota;
		this.ano = ano;
	}

	public double getNota() {
		return nota;
	}

	public String getNome() {
		return nome;
	}

	public int getAno() {
		return ano;
	}

	public static void main(String[] args) {
		ArrayList<Filme> list = new ArrayList<Filme>();
		list.add(new Filme("DJango", 8.3, 2015));
		list.add(new Filme("Bastards Inglorios", 8.7, 2012));
		list.add(new Filme("Kill Bill", 8.8, 2010));
		list.add(new Filme("Polp Fiction", 8.4, 1998));

		Collections.sort(list);

		System.out.println("Filmes depois da ordenacao  : ");
		for (Filme Filme : list) {
			System.out.println(Filme.getNome() + " " + Filme.getNota() + " " + Filme.getAno());
		}

		System.out.println("\nPor nome");
		CompararNome comparadorNome = new CompararNome();
		Collections.sort(list, comparadorNome);
		for (Filme filme : list)
			System.out.println(filme.getNome() + " " + filme.getNota() + " " + filme.getAno());

		System.out.println("\nPor nota");
		CompararNota notaComp = new CompararNota();
		Collections.sort(list, notaComp);
		for (Filme filme : list)
			System.out.println(filme.getNome() + " " + filme.getNota() + " " + filme.getAno());

	}
}

class CompararNota implements Comparator<Filme> {
	public int compare(Filme m1, Filme m2) {
		if (m1.getNota() < m2.getNota())
			return -1;
		if (m1.getNota() > m2.getNota())
			return 1;
		else
			return 0;
	}
}

class CompararNome implements Comparator<Filme> {
	public int compare(Filme m1, Filme m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
}
