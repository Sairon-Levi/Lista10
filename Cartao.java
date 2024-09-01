
public class Cartao {

	private int numero;
	private Cliente titular;

	public Cartao(int numero, Cliente titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
