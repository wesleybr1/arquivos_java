package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String titularConta, int agencia, int numeroConta) {
		super(titularConta, agencia, numeroConta);
	}

	@Override
	public void sacar(double quantiaSacar) {
		if (saldo - quantiaSacar >= 0.00) {
			saldo = saldo - (quantiaSacar + 5);
		}
		else {
			System.out.println("Saldo indisponivel!");
		}
	}
	
	@Override
	public void depositar(double quantiaDeposito) {
		saldo = saldo + quantiaDeposito;
	}
}