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
		//questão7();
		//vetor();
//		Scanner sc = new Scanner(System.in);
//		
//		Triangulo x = new Triangulo();
//		Triangulo y = new Triangulo();
//		
//		System.out.println("Informe os 3 lados do triângulo X");
//		x.ladoA = sc.nextDouble();
//		x.ladoB = sc.nextDouble();
//		x.ladoC = sc.nextDouble();
//		
//		System.out.println("Informe os 3 lados do triângulo Y");
//		y.ladoA = sc.nextDouble();
//		y.ladoB = sc.nextDouble();
//		y.ladoC = sc.nextDouble();
//		
//		double areaX = x.calcularAreaTriangulo();//sqrt = raiz quadrada
//		double areaY = y.calcularAreaTriangulo();
//		
//		System.out.println("A área do triângulo X foi: "+areaX);
//		System.out.println("A área do triângulo Y foi: "+areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("A área do triângulo X é maior que a área do triângulo Y");
//		}else {
//			System.out.println("A área do triângulo Y é maior que a área do triângulo X");
//		}
//		
//		sc.close();		
		
		
		
	}
	
	public static void vetor() {
	    Scanner sc = new Scanner(System.in);
	
	    System.out.println("Quantos elementos terá o vetor?");
	    int n = sc.nextInt(); // tamanho do vetor
	    int v[] = new int[n]; // declaração do vetor "v"
	    int i; // índice ou posição
	    
	// Entrada de Dados
	    //n = 5
	    for (i=0; i<n; i++) {
	      System.out.printf("Informe o %dº. valor de %d: ", (i+1), n);
	      v[i] = sc.nextInt();
	    }
	
	// Processamento: somar todos os valores, definir o maior e o menor valor
	    int soma = 0;
	    int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
	    int maior = v[0];
	    //menor = 1
	    //maior = 5
	    //soma = 15
	    
	    
	    for (i=0; i<n; i++) {
	      soma = soma + v[i];
	
	      if (v[i] < menor) {
	    	  menor = v[i];
	      }	         
	
	      if (v[i] > maior) {
	    	  maior = v[i];
	      }
	         
	    }
	
	// Saída (resultados)
	    System.out.println();
	    for (i=0; i<n; i++) {
	      if (v[i] == menor) {
	    	  System.out.printf("v[%d] = %d <--- menor valor\n", i, v[i]);
	      }else {
	    	  if (v[i] == maior) {
	    		  System.out.printf("v[%d] = %d <--- maior valor\n", i, v[i]);
	    	  }else {
	    		  System.out.printf("v[%d] = %d\n", i, v[i]);
	    	  }
	      }	    
	    }
	
	    System.out.printf("\nSoma = %d\n", soma);
	    
	    sc.close();
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

	}
	
	public static void questao7() {
//		Elabore um algoritmo que calcule o que deve ser pago por um produto,
//		considerando o preço normal de etiqueta e a escolha da condição de pagamento.
//		Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida
//		e efetuar o cálculo adequado.
//
//		Código da Condição de pagamento
//		1 - À vista em dinheiro ou cheque, recebe 10 porcento de desconto
//		2 - À vista no cartão de crédito, recebe 15 porcento de desconto
//		3 - Em duas vezes, preço normal de etiqueta sem juros
//		4 - Em duas vezes, preço normal de etiqueta mais juros de 10 porcento
	}
}
