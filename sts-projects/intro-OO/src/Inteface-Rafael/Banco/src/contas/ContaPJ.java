package contas;

public class ContaPJ extends Conta{
	
	private double limiteCredito;
	
	public ContaPJ(int numero, String nome) {
		super(numero, nome);
		this.limiteCredito = 100.0;
	}
	
	public ContaPJ(int numero, String nome, double saldo, double limiteCredito) {
		super(numero, nome, saldo);	
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public void depositar(double valor) {
		valor += 5;
		super.saldo = valor;
	}

	@Override
	public String toString() {
		return "ContaPJ [limiteCredito=" + limiteCredito + ", getNumero()=" + getNumero() + ", getNome()=" + getNome()
				+ ", getSaldo()=" + getSaldo();
	}

	@Override
	public void dadosBancarios() {
		System.out.println("Nome: "+super.getNome());
		
	}

	
	

}
