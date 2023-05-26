package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				
		System.out.print("Entre com o valor em real que deseja converter : R$ ");
		double valorReal = sc.nextDouble();
			
		System.out.print("Entre com o valor em dolar que deseja converter : $ ");
		double valorDolar = sc.nextDouble();
				
		System.out.print("Entre com o valor do dolar: $ ");
		double valorDoDolar = sc.nextDouble();
				
		converterEmDolar(valorReal, valorDoDolar);
		converterEmReal(valorDolar, valorDoDolar);		
		
		sc.close();
		
	}
	
	static void converterEmDolar(double real, double dolar) {
		System.out.printf("O valor R$ %.2f convertido em Dolar é : $ %.2f.", real, (real / dolar) );
	}
			
	static void converterEmReal(double dolar, double real) {
		System.out.printf("\nO valor $ %.2f convertido para o Real é : R$ %.2f.", dolar, (dolar * real));
	}
				
}