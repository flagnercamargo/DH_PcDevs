package contas;

public class ContaPF extends Conta{
	
	private boolean temCartao; //true ou false
	
	public ContaPF(int numero, String nome) {
		super(numero, nome);
		this.temCartao = false;
	}
	
	public ContaPF(int numero, String nome, double saldo, boolean temCartao) {
		super(numero, nome, saldo);
		this.temCartao = temCartao;
	}
	
	public boolean isTemCartao() {
		return temCartao;
	}

	public void setTemCartao(boolean temCartao) {
		this.temCartao = temCartao;
	}

	@Override
	public String toString() {
		return "ContaPF [temCartao=" + temCartao + ", getNumero()=" + getNumero() + ", getNome()=" + getNome()
				+ ", getSaldo()=" + getSaldo() + "]";
	}

	@Override
	public void dadosBancarios() {
			System.out.println("Número: "+super.getNumero());	
	}
	
	
}
