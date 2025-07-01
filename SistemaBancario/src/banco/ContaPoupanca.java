package banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta poupança ===");
		super.imprimirInfosComuns();
	}

}
