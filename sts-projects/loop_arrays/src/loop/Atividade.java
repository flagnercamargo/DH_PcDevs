package loop;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		vetor();
		//questao0(); // Não está no PDF da aula
		//questao3while();
		//questao3for();
		//exercicio01();
		//exerc_triangulos();
	}
	
	public static void vetor() {
		Scanner sc = new Scanner(System.in);
		
	    int n = 10; // tamanho do vetor
	    int v[] = new int[n]; // declaração do vetor "v"
	    int i; // índice ou posição
	    
	    // Entrada de Dados
	    for (i=0; i<n; i++) {
	    	System.out.printf("Informe %do. valor de %d: ", (i+1), n);
	    	v[i] = sc.nextInt();
	    }
	    
	    // Processamento: somar todos os valores, definir o maior e o menor valor
	    int soma = 0;
	    int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
	    int maior = v[0];
	    
	    for (i=0; i<n; i++) {
	    	soma = soma + v[i];
	    	
	    	if (v[i] < menor)
	    		menor = v[i];
	    	
	    	if (v[i] > maior)
	    		maior = v[i];
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

		public static void questao0() {
			// Questão 0
			// Faça um código que irá receber um interiro numero N, 
			// depois o programa irá receber mais um numero inteiro X 
			// e verificar se N é divisivel por X. Caso a condição seja 
			// verdadeira o programa imprime uma mensagem de sucesso, senão 
			// ela vai ler mais uma vez o numero X e verificar a condional.

			Scanner sc = new Scanner(System.in);
			int n,x;
			
			System.out.println("Digite um númerador: ");		
			n = sc.nextInt();
			
			do {
				System.out.println("Digite um denominador: ");		
				x = sc.nextInt();
				if (n%x != 0) {
					System.out.println("O número " + n + " não é divisível por " + x + ".");
				}
			} while ((n % x) != 0); {
				System.out.println("O número " + n + " é divisível por " + x + ".");
			}
			sc.close();
		}

		public static void questao3while() {
			
			// Calcular o Fatorial do número inserido pelo usuário. Este número precisa ser inteiro e positivo.
			// Sendo Fatorial => 3! = 3 * 2 * 1 = 6
			// Imprima o valor desse Fatorial.
			
			
			Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("Digite o número a ser fatorado: ");		
			n = sc.nextInt();
			
			int fat = n,i = n;
			
			while (i >1) {
				fat = fat*(i-1);
				i--;				
			}
			System.out.println("O Fatorial de " + n + " é = " + fat + ".");
			sc.close();
		}
		
		public static void questao3for() {
			
			// mesmo do anterior, mas usando FOR			
			
			Scanner sc = new Scanner(System.in);
			int n,fat = 1;
			
			System.out.println("Digite o número a ser fatorado: ");		
			n = sc.nextInt();
			
			for (int i = n ; i > 1 ; i-- ) {
				fat = fat*i;				
			}
			System.out.println("O Fatorial de " + n + " é = " + fat + ".");
			sc.close();
		}
		
		public static void exercicio01() {
			// Cálculos salários
			Scanner sc = new Scanner(System.in);
			int ano = 1995;
			double salario = 0, aumento = 1.5;
			System.out.println("Digite o valor do salário: ");
			salario = sc.nextDouble();
			do {
				if (ano == 1995) {
					salario = salario + ((salario / 100) * aumento);
				} else {
					aumento = 3;
					salario = salario + ((salario / 100) * aumento);
				}
				BigDecimal salarioArr = new BigDecimal(salario).setScale(2, RoundingMode.HALF_EVEN);
				System.out.println("O salário en " + ano + " é de: " + salarioArr);
				ano++;
			} while (ano <= 2021);
			sc.close();
		}
		
		
		public static void exerc_triangulos() {

			Scanner sc = new Scanner(System.in);
					
					double xA, xB, xC, yA, yB, yC;
					System.out.println("Informe os 3 lados do triângulo X");
					xA = sc.nextDouble();
					xB = sc.nextDouble();
					xC = sc.nextDouble();
					
					System.out.println("Informe os 3 lados do triângulo Y");
					yA = sc.nextDouble();
					yB = sc.nextDouble();
					yC = sc.nextDouble();
					
					double pX = (xA+xB+xC)/2;
					double areaX = Math.sqrt((pX*(pX-xA)*(pX-xB)*(pX-xC))); //sqrt = raiz quadrada
					
					double pY = (yA+yB+yC)/2;
					double areaY = Math.sqrt((pY*(pY-yA)*(pY-yB)*(pY-yC)));
					
					System.out.println("A área do triângulo X foi: "+areaX);
					System.out.println("A área do triângulo Y foi: "+areaY);
					
					if(areaX > areaY) {
						System.out.println("A área do triângulo X é maior que a área do triângulo Y");
					}else {
						System.out.println("A área do triângulo Y é maior que a área do triângulo X");
					}
					sc.close();
				}
		



}
