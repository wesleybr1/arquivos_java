package principal;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = ler.nextInt();
		 
		System.out.println("O número informado foi " + num);
		ler.close();
	}

}
