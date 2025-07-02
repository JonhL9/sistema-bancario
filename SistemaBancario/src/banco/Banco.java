package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public void criarContaCorrente(Cliente titular) {
		Conta novaConta = new ContaCorrente(titular);
		contas.add(novaConta);
	}
	public void criarContaPoupanca(Cliente titular) {
		Conta novaConta = new ContaPoupanca(titular);
		contas.add(novaConta);
	}
	public List<Conta> contasPorCliente(Cliente titular){
		return this.contas.stream().filter(c -> c.getProprietario() == titular).collect(Collectors.toList());
	}
}
