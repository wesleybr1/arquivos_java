package principal;

import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double s = 1300;
		
		double di = 0.05;
		
		double irpf = 0.03;
		
		System.out.print("Informe o nome do funcionáio : ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o de referência mês: ");
		String mes = sc.nextLine();
		
		System.out.print("Informe o valor total de vendas que realizou neste mês: ");
		double v = sc.nextDouble();
		
		calculo(v, nome, mes);
		descInss(s, di, nome, mes);
		descIRPF(s, irpf, nome, mes);
		ScomDesc(s, irpf, di);
		calcS(s, v, nome, mes);
		
		sc.close();
	}

	static void calculo(double v, String nome, String mes) {
		if (v > 20000){
			System.out.printf("O funcionario " + nome + " receberá uma bonificação de R$ %.2f (5%%), sobre o valor das vendas referente ao mês de " + mes + ".\n" , (v*0.05));
		}
		
		else if (v>15000 && v<20000) {
			System.out.printf("O funcionario " + nome + " receberá uma bonificação de R$ %.2f (3%%), sobre o valor das vendas referente ao mês de " + mes + ".\n" , (v*0.03));
		}
		
		else if (v > 10000 && v < 15000) {
			System.out.printf("O funcionario " + nome + " receberá uma bonificação de R$ %.2f (3%%), sobre o valor das vendas referente ao mês de " + mes + "\n" , (v*0.01));
		}
		
		else {
			System.out.println("Se quer ganhar bonificação TRABALHE MAIS no proximo mês.");
		}
	}
	
	static void descInss(double s, double di, String nome, String mes) {
		System.out.printf("O desconto do INSS sobre o salario do funcionário " + nome + " no mês de " + mes + " é de R$ %.2f. \n" , (s * di));
	}
	
	static void descIRPF(double s, double irpf, String nome, String mes) {
		System.out.printf("O desconto do IRPF sobre o salario do funcionário " + nome + " no mês de " + mes + " é de R$ %.2f.\n" , (s * irpf));
	}
	
	static void ScomDesc(double s, double irpf, double di) {
		System.out.printf("O salario com descontos é de R$ %.2f. \n" , (s -((s * irpf)+(s * di))));
	}
	
	static void calcS(double s, double v, String nome, String mes) {
			System.out.printf("O salário líquido do funcionário " + nome + " no mês de " + mes + " será de R$ %.2f.\n" , (s+(v*0.05)));
	}
}
