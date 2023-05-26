package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrete;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//Conta conta = new Conta();
		
		String nome = "wesley";
		int contaNumero = 1234;
		int agencia = 4321;
		
		Conta conta = new Conta(nome, contaNumero, agencia);
		
		Conta contaCorrete = new ContaCorrete(nome, contaNumero, agencia);
		Conta contaPoupanca = new ContaPoupanca(nome, contaNumero, agencia);
		
		
		conta.depositar(20.00);
		conta.sacar(10.00);
		System.out.println(conta);
		
		System.out.println("/*********************************/");
		
		contaCorrete.depositar(00.00);
		contaCorrete.sacar(00.00);
		System.out.println(contaCorrete);
		
		System.out.println("/*********************************/");
		
		contaPoupanca.depositar(50.00);
		contaPoupanca.sacar(00.00);
		System.out.println(contaPoupanca);
		
		/*System.out.print("Entre com o numero da conta: ");
		conta.setNumeroDaConta(sc.nextInt());
		
		System.out.print("Entre com a agencia: ");
		conta.setAgencia(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Entre com o titular da conta: ");
		conta.setTitular(sc.nextLine());
		
		System.out.print("Entre com o valor do deposito: ");
		conta.depositar(sc.nextDouble());
				
		System.out.println(conta);
		System.out.println("Saldo: " + conta.getSaldo());
		
		System.out.print("Qual o valor do saque: ");
		conta.sacar(sc.nextDouble());
		
		System.out.println(conta);
		System.out.println("Saldo: " + conta.getSaldo());*/
		
		sc.close();
		}

}
