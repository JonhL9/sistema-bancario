package banco;

import java.util.List;

public class Main {

	public static void main(String[] args){
		Banco banco = new Banco("Banco Local");
		
		Cliente cliente1 = new Cliente("José");
		Cliente cliente2 = new Cliente("Maria");
		
		banco.criarContaCorrente(cliente1);
		banco.criarContaPoupanca(cliente1);
		
		banco.criarContaCorrente(cliente2);
		
		
		List<Conta> contasCliente1 =  banco.contasPorCliente(cliente1);
		Conta conta1 = contasCliente1.get(0);
		Conta conta2 = contasCliente1.get(1);
		
		List<Conta> contasCliente2 =  banco.contasPorCliente(cliente2);
		Conta conta3 = contasCliente2.get(0);
		
		conta1.depositar(300);
		
		conta1.sacar(50);
		
		conta1.transfeir(conta3, 100);
		
		conta2.sacar(200);
		
		conta3.transfeir(conta2, 25);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		conta3.imprimirExtrato();
		
	}

}
