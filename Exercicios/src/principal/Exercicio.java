package principal;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int num = ler.nextInt();
		 
		System.out.println("O n�mero informado foi " + num);
		ler.close();
	}

}
