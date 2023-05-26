package entities;

public class Conta {
	
	/*
	 * ordem de visualização ou declaração:
	 *1º Atributos
	 *2º Construtores da classe 
	 *3º Metodos get e set
	 *4º Metodos (funções) necessarios
	 */
	
	private String titularConta;
	private int agencia;
	private int numeroConta;
	protected double saldo;
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Conta(String titularConta, int agencia, int numeroConta) {
		super();
		this.titularConta = titularConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double quantiaDeposito) {
		saldo = saldo + quantiaDeposito;
	}
	
	public void sacar(double quantiaSacar) {
		saldo = saldo - quantiaSacar;
	}
	
	public void mostraDadosDaConta() {
		System.out.println("Nome do titular: " + getTitularConta());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Numero da conta: " + getNumeroConta());
		System.out.println("Saldo:  " + getSaldo());
		
		
	}
	
}
