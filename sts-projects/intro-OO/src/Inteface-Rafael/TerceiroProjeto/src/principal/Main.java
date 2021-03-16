package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Atalho para importar CTRL+SHIFT+O
				
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quant = sc.nextInt();	
		
		Produto p1 = new Produto(nome, preco, quant);
		
		Produto p2 = new Produto();
		p2.setNome("Geladeira");
		p2.setPreco(600.00);
		p2.setQuantidade(20);
			
		System.out.println();
						
		System.out.println(p1);	
		System.out.println(p2);
		
		System.out.print("Digite a quantidade de itens a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		p1.adicionarEmEstoque(quantidade);
		System.out.println(p1);			
		
		System.out.print("Digite a quantidade de itens a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		p1.retirarDoEstoque(quantidade);
		System.out.println(p1);			
		
		sc.close();	
			
	}
	
	
	public void pessoa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu CPF: ");
		int cpf = sc.nextInt();
		
		exibirCPF(cpf);
		
		sc.close();
	}
	
	public void exibirCPF(int cpf) {
		System.out.println("Exibindo o cpf: "+cpf);
	}
	
	
	
	public static void esfera() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");		
		double raio = sc.nextDouble();
				
		Esfera.circunferencia(raio);
		Esfera.volume(raio);		
	
		System.out.println("PI: "+Esfera.pi);
		
		sc.close();
	}
	
	public static void produto() {
		
	}
}
