package heranca;

import java.util.Scanner;

import contas.Conta;
import contas.ContaPF;
import contas.ContaPJ;

	public class Main {

		public static void main(String[] args) {
			
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
			sc.close();
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