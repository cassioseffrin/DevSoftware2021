package br.edu.cassio.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoCliente {

	public static void main(String a[]) {

		List<String> lst = new ArrayList<>();
		lst.add("Bruna");
		lst.add("Joana");
		lst.add("Maria");
		lst.add("Fernanda");
		lst.add("Xuxa");
		lst.add("Adriana");
		
		Collections.sort(lst);
		
		for( String i: lst) {
			System.out.println(i);
		}
		

	}

}
