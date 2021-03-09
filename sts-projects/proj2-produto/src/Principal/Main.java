package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Atalho para importar CTRL+SHIFT+O
		Produto p1 = new Produto();
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		p1.nome = sc.nextLine();
		System.out.print("Preço: ");
		p1.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		p1.quantidade = sc.nextInt();
		System.out.println(p1);		
		
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

}
