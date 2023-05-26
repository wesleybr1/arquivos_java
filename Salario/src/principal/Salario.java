package principal;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double salariohr = ler.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		int hrmes = ler.nextInt();
		
		double salario = salariohr * hrmes;
		System.out.printf("O salario no referido mês será de R$ %.2f", salario);
		
		ler.close();
	}

}