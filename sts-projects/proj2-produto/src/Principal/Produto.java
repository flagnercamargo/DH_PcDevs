package Principal;

public class Produto {
	
	String nome;
	double preco;
	int quantidade;
	
	public double valorTotalEmEstoque() {		
		return preco*quantidade;
	}
	
	public void adicionarEmEstoque(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void retirarDoEstoque(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}
	
	@Override
	public String toString() {
		return "Dados do produto: " + nome + ", R$ " + preco + ", " + quantidade + " unidades, Total: R$ "
				+ valorTotalEmEstoque();
	}

}
