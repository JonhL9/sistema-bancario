package banco;

public abstract class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private static int agenciaPadrao = 1000;
	private static int sequential = 1;
	private Cliente titular;
	
	public Conta(Cliente cliente) {
		this.numero = 50000 + sequential;
		sequential += 1;
		this.agencia = agenciaPadrao;
		this.saldo = 0.0;
		this.titular = cliente;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;	
	}

	public void sacar(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void transfeir(Conta favorecido, double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			favorecido.depositar(valor);
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", Titular="+this.titular.getNome()+"]";
	}

	public Cliente getProprietario() {
		return titular;
	}

	public void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Titular: %s", this.titular.getNome()));

	}
	public abstract void imprimirExtrato();

	
}
