package banco;

public class Banco {
	public static void main(String[] args){
		Cliente cliente1 = new Cliente("José");
		
		Conta conta1 = new ContaCorrente(cliente1);
		Conta conta2 = new ContaPoupanca(cliente1);
		conta1.depositar(300);
		conta1.sacar(50);
		conta1.transfeir(conta2, 100);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
	}
	
}
