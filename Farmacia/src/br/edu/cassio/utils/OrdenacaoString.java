package br.edu.cassio.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.cassio.Cliente;

 
 

public class OrdenacaoString {

	public static void main(String a[]) {

		List<Cliente> lst = new ArrayList<>();
		Cliente c1 = new Cliente(  "Cassio",   "234234",   "234234",   "Rua A",   "3442.3424");
		Cliente c2 = new Cliente(  "Adriano",   "234234",   "234234",   "Rua A",   "3442.3424");
		Cliente c3 = new Cliente(  "Rodrigo",   "234234",   "234234",   "Rua A",   "3442.3424");
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
	
		
		Collections.sort(lst);
		
		for( Cliente c: lst) {
			System.out.println(c);
		}
		
		System.out.println(Collections.max(lst));
		

	}

}
