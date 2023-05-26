package principal;

import java.util.Scanner;

public class Graus {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		double grauF = ler.nextDouble();
		
		double grauC = 5*((grauF - 32)/9);
		
		System.out.printf("O grau informado é o equivalente a %.2f graus Celsius.", grauC);
		
		ler.close();
	}

}
