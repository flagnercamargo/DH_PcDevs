package Principal;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		//questao1();
		//questao2();
		//questao3();
		//questao4();
		//questao5();
		//questao6();
		//questao7();
		//questao8();
	}
	
	public static void questao1() {
//		Crie um algoritmo em Java que leia a idade de uma pessoa e informe a sua classe
//		eleitoral:
//		• não eleitor (abaixo de 16 anos);
//		• eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
//		• eleitor facultativo (de 16 até 18 anos ou maior que 65 anos).
		
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");		
		idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Não é eleitor!");
		}else {
			if( (idade >= 18) && (idade < 65) ) { //&&, ||
				System.out.println("Eleitor Obrigatório!");
			}else {
				System.out.println("Eleitor Facultativo!");
			}
		}	
		
		sc.close();
	}
	
	public static void questao2() {
//		Escreva um algoritmo em Java que leia um número e informe se ele é divisível
//		por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
//		Dica: Usar o operador % (conhecido como mod).
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");		
		numero = sc.nextInt();
		
		if( numero%10 == 0 ) {
			System.out.println("É divisível por 10");
		}
		
		if ( numero%5 == 0 ) {
			System.out.println("É divisível por 5");
		}
		
		if ( numero%2 == 0 ) {
			System.out.println("É divisível por 2");
		}
		
		if( (numero%10 != 0) && (numero%5 != 0) && (numero%2 !=0) ) {
			System.out.println("Não é divisível por 10, 5 ou 2!");
		}
		sc.close();
		
	}
	
	public static void questao3() {
//		Faça um algoritmo que leia os valores A, B, C e
//		imprima na tela se a soma de A + B é menor que C.
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, soma;
		
		System.out.println("Digite um valor para A: ");		
		A = sc.nextInt(); 
		System.out.println("Digite um valor para B: ");		
		B = sc.nextInt(); 
		System.out.println("Digite um valor para C: ");		
		C = sc.nextInt(); 
		
		soma = A+B;
		
		if(soma < C) {
			System.out.println("A soma de "+ A + " + "+ B +" é menor que "+C);
		}else {
			System.out.println("A soma de "+ A + " + "+ B +" é maior ou igual a "+C);
		}
		
		sc.close();
		
	}
	
	public static void questao4() {
//		Faça um algoritmo que leia dois valores inteiros A e B
//		se os valores forem iguais deverá se somar os dois,
//		caso contrário multiplique A por B. Ao final de qualquer um
//		dos cálculos deve-se atribuir o resultado para uma variável
//		C e mostrar seu conteúdo na tela.
		
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite um valor para A: ");		
		A = sc.nextInt(); 
		System.out.println("Digite um valor para B: ");		
		B = sc.nextInt(); 
		
		if(A == B) {
			C = A+B;
		}else {
			C = A*B;
		}
		
		System.out.println("O resultado da operação é: " + C);
		
		sc.close();
	}
	
	public static void questao5() {
//		Escreva um algoritmo em Java para determinar se um número A é divisível por 
//		um outro número B. Esses valores devem ser fornecidos pelo usuário.
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um valor para A: ");		
		A = sc.nextInt(); 
		System.out.println("Digite um valor para B: ");		
		B = sc.nextInt(); 
		
		if (A%B == 0) {
			System.out.println(A + " é divisível por " + B);
		}else {
			System.out.println(A + " não é divisível por " + B);
		}
		
		sc.close();
	}
	
	public static void questao6() {
//		Faça um algoritmo que leia uma variável e some 5 caso seja par ou 
//		some 8 caso seja ímpar, imprimir o resultado desta operação.
		
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		System.out.println("Digite um número: ");		
		A = sc.nextInt();
		
		if (A%2 == 0) {
			B = A + 5;
			System.out.println("Sendo "+A+" um número par, o resultado é: " + B + ".");
		}else {
			B = A + 8;
			System.out.println("Sendo "+A+" um número ímpar, o resultado é: " + B + ".");
		}		
		sc.close();
	}
	
	public static void questao7() {
//		Elabore um algoritmo que calcule o que deve ser pago por um produto,
//		considerando o preço normal de etiqueta e a escolha da condição de pagamento.
//		Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
//		escolhida e efetuar o cálculo adequado.
//
//		Código da Condição de pagamento
//		1 - À vista em dinheiro ou cheque, recebe 10 porcento de desconto
//		2 - À vista no cartão de crédito, recebe 15 porcento de desconto
//		3 - Em duas vezes, preço normal de etiqueta sem juros
//		4 - Em três vezes, preço normal de etiqueta mais juros de 10 porcento
		
		Scanner sc = new Scanner(System.in);
		
		double valorEtiqueta,valorFinal;
		System.out.println("Digite o valor da Etiqueta: ");		
		valorEtiqueta = sc.nextDouble();
						
		int opcaoPagto;
		System.out.println("1 - À vista em dinheiro ou cheque.");
		System.out.println("2 - À vista no cartão de crédito.");
		System.out.println("3 - Em duas vezes.");
		System.out.println("4 - Em três vezes.");
		System.out.println("Digite a opção de Pagamento: ");		
		opcaoPagto = sc.nextInt();
		
		if ( opcaoPagto == 1) {
			valorFinal = valorEtiqueta * 0.9;
			System.out.println("Seu valor Final é: " + valorFinal);
		}else if ( opcaoPagto == 2) {
			valorFinal = valorEtiqueta * 0.85;
			System.out.println("Seu valor Final é: " + valorFinal);
		}else if ( opcaoPagto == 3) {
			valorFinal = valorEtiqueta;
			System.out.println("Seu valor Final é: " + valorFinal);
		}else if ( opcaoPagto == 4) {
			valorFinal = valorEtiqueta * 1.1;
			System.out.println("Seu valor Final é: " + valorFinal);
		}
		sc.close();
	}
	
	public static void questao8() {
//		Igual a anterior mas com SWITCH/CASE
		
		Scanner sc = new Scanner(System.in);
		
		double valorEtiqueta,valorFinal;
		System.out.println("Digite o valor da Etiqueta: ");		
		valorEtiqueta = sc.nextDouble();
						
		int opcaoPagto;
		System.out.println("1 - À vista em dinheiro ou cheque.");
		System.out.println("2 - À vista no cartão de crédito.");
		System.out.println("3 - Em duas vezes.");
		System.out.println("4 - Em três vezes.");
		System.out.println("Digite a opção de Pagamento: ");		
		opcaoPagto = sc.nextInt();
		
		switch (opcaoPagto) {
		case 1: {
			valorFinal = valorEtiqueta * 0.9;
			System.out.println("Seu valor Final é: " + valorFinal);
			break;
		}
		case 2: {
			valorFinal = valorEtiqueta * 0.85;
			System.out.println("Seu valor Final é: " + valorFinal);
			break;
		}
		case 3: {
			valorFinal = valorEtiqueta;
			System.out.println("Seu valor Final é: " + valorFinal);
			break;
		}
		case 4: {
			valorFinal = valorEtiqueta * 1.1;
			System.out.println("Seu valor Final é: " + valorFinal);
			break;
		}
		default:
			System.out.println("A opção: " + opcaoPagto + " é inválida!");
		}
		sc.close();
	}
}
