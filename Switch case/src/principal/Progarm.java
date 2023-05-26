package principal;

import java.util.Scanner;

public class Progarm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número entre 1 e 7: ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Domingo!");
		break;
		
		case 2:
			System.out.println("Segunda!");
		break;
		
		case 3:
			System.out.println("Terça!");
			break;
			
		default:
			System.out.println("Número informado não corresponde a nenhum dia da semana.");
		break;
		
		}
		
		sc.close();
	}

}
