package contas;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	public Conta (int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0.0;
	}

	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		//this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
		//this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
	}		
	
}