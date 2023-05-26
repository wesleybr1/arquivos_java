package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String titularConta, int agencia, int numeroConta) {
		super(titularConta, agencia, numeroConta);
	}
	
	@Override
	public void sacar(double quantiaSacar) {
		if (saldo - quantiaSacar > -150.00) {
			saldo = saldo - (quantiaSacar + 2);
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
