package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import contas.Conta;
import contas.ContaPF;
import contas.ContaPJ;
import geometria.Objeto;
import geometria.Retangulo;

public class Main{

	public static void main(String[] args) {
		
		ContaPJ pj = new ContaPJ(123456, "Eduardo");		
		ContaPF pf = new ContaPF(987654, "Wesley");
				
		
	}
	
	public static void interfaces() {
		Objeto o = new Retangulo();
		Objeto a = new Retangulo();
		
		System.out.println(o.volume());
		
		List<Integer> lista = new LinkedList<>();
				
			
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
		
		
		Integer j;
		String numero = "50.96";
		//int i = Integer.parseInt(numero);
		double valor = Double.parseDouble(numero);
		
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
		
		List<Integer> result = numeros.stream().filter(x -> x >= 4).collect(Collectors.toList());
		result.stream().forEach(i -> System.out.println(i));
		
		result.stream().forEach(System.out::println);
	}
	
	public static void polimorfismo() {
		Scanner sc = new Scanner(System.in);
		
		Conta c1;
		
		System.out.println("1 - Pessoa Jurídica");
		System.out.println("2 - Pessoa Física");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			c1 = new ContaPJ(123698, "Rafael");
		}else {
			c1 = new ContaPF(123698, "Rafael", 0.0, true);
		}
		
		if(c1 instanceof ContaPJ) {
			System.out.println("Essa é uma Conta PJ");
		}else {
			if(c1 instanceof ContaPF) {
				System.out.println("Essa é uma Conta PF");
			}
		}
		
		System.out.println(c1);
		sc.close();
	}
	
	public static void contas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do correntista:");
		String nome = sc.nextLine();		
		int numero = (int)(Math.random()*100000);
		System.out.println("O número da sua conta é: "+ numero);			
		ContaPJ c1pj = new ContaPJ(numero, nome);		
		System.out.println(c1pj);		
		System.out.println("Quanto você quer depositar? ");
		double valor = sc.nextDouble();		
		c1pj.depositar(valor);		
		System.out.println("Seu novo saldo PJ é: " + c1pj.getSaldo());
		
		sc.nextLine();
		System.out.println("Digite o nome do correntista:");
		nome = sc.nextLine();		
		numero = (int)(Math.random()*100000);
		System.out.println("O número da sua conta é: "+ numero);
		ContaPF c1pf = new ContaPF(numero, nome);
		System.out.println(c1pf);		
		System.out.println("Quanto você quer depositar? ");
		valor = sc.nextDouble();		
		c1pf.depositar(valor);		
		System.out.println("Seu novo saldo PF é: " + c1pf.getSaldo());
		sc.close();
	}

}
