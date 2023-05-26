package entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String titular, int numeroConta, int agencia) {
		super(titular, numeroConta, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double valor) {
		if ((saldo - (valor + 5)) < saldo) {
			System.out.println("Saldo indisponivel");
		}
		else {
			saldo -= valor + 5;
		}
	}
	
	/*@Override
	public void sacarNeg(double sacar) {
		if (sacar > saldo) {
			System.out.println("Saldo insuficiente!");
		}
		else {
			saldo -= sacar;
		}
	}*/
}
