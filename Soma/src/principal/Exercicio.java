package principal;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num1 = ler.nextInt();
		 
		System.out.println("Informe outro número: ");
		int num2 = ler.nextInt();
		
		System.out.println("A soma dos dois números informados é: " + (num1 + num2));
		
		ler.close();
	}

}