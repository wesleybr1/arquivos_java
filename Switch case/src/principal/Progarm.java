package principal;

import java.util.Scanner;

public class Progarm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero entre 1 e 7: ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Domingo!");
		break;
		
		case 2:
			System.out.println("Segunda!");
		break;
		
		case 3:
			System.out.println("Ter�a!");
			break;
			
		default:
			System.out.println("N�mero informado n�o corresponde a nenhum dia da semana.");
		break;
		
		}
		
		sc.close();
	}

}
