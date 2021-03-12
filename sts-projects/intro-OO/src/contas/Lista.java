package contas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		ContaPJ c1pj = new ContaPJ(123456, "Eduardo");		
		ContaPJ c2pj = new ContaPJ(987654, "Wesley");
		ContaPJ c3pj = new ContaPJ(159753, "Danilo");
		ContaPJ c4pj = new ContaPJ(654123, "Adao");
		ContaPJ c5pj = new ContaPJ(785214, "Kelly");
		
		List<ContaPJ> contas = new ArrayList<>();
		System.out.println(contas.size());
		contas.add(c1pj);
		contas.add(c2pj);
		contas.add(c3pj);
		contas.add(2, c4pj);
		contas.add(c5pj);
		System.out.println(contas.size());
		
		System.out.println(contas.get(2).getNome()+", "+contas.get(2).getSaldo());
		//contas.remove(2);
		System.out.println(contas.size());
	
		for(ContaPJ pj : contas) {
			System.out.println(pj.getNome());
		}
		
		// exemplos de Parse, alterar tipo
		// String numero = "50.96";
		// int i = Integer.parseInt(numero);
		// double valor = Double.parseDouble(numero);
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(Integer.parseInt("4"));
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		
		for(Integer i : numeros) {
			System.out.println(i);
		}
		
		// Linguagem funcional Lambda
		List<Integer> result = numeros.stream().filter(x -> x >= 4).collect(Collectors.toList());
		result.stream().forEach(i2 -> System.out.println(i2));
		// é o mesmo que a linha anterior
		result.stream().forEach(System.out::println);
	}		
}
