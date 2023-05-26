package principal;

import java.util.Scanner;

public class GrausF {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double grauC = ler.nextDouble();
		
		double grauF = grauC * 1.8 + 32;
		
		System.out.printf("O grau informado é o equivalente a %.2f graus Fahrenheit.", grauF);
		
		ler.close();

	}

}
