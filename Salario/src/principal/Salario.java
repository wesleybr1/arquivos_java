package principal;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double salariohr = ler.nextDouble();
		
		System.out.println("Informe o n�mero de horas trabalhadas no m�s: ");
		int hrmes = ler.nextInt();
		
		double salario = salariohr * hrmes;
		System.out.printf("O salario no referido m�s ser� de R$ %.2f", salario);
		
		ler.close();
	}

}