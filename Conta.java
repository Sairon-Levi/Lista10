public class Conta {

	private int numero;
	private Cartao cartao;
	private int senha;
	private double saldo;
	
	public Conta(int numeroConta, int numeroCartao, Cliente cliente,
			int senha, double saldo) {
		this.numero = numeroConta;
		this.cartao  = new Cartao(numeroCartao, cliente);
		this.senha = senha;
		this.saldo = saldo;
	}

	public Cartao getCartao() {
		return this.cartao;
	}

	public double verificaSaldo(int senha) {
		if(this.senhaEhValida(senha)) {
			return saldo;
		}
		return -1;
	}
	
	public boolean creditaValor(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean debitaValor(double valor, int senha) {
		if(this.senhaEhValida(senha) && valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	private boolean senhaEhValida(int senha) {
		return this.senha == senha;
	}
}
