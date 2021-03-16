package principal;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto() {

	}

	// CTRL+3 - ggas

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	private double valorTotalEmEstoque() {
		return preco * quantidade;
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
