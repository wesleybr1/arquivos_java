package principal;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int num1 = ler.nextInt();
		 
		System.out.println("Informe outro n�mero: ");
		int num2 = ler.nextInt();
		
		System.out.println("A soma dos dois n�meros informados �: " + (num1 + num2));
		
		ler.close();
	}

}