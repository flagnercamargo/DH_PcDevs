package loop;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		questao0(); // Não está no PDF da aula
		//questao3while();
		//questao3for();
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
		



}
