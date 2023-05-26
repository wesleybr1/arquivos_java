package principal;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do primeiro lado do tri�ngulo: ");
		int lado1 = sc.nextInt();
		System.out.print("Informe o tamanho do segundo lado do tri�ngulo: ");
		int lado2 = sc.nextInt();
		System.out.print("Informe o tamanho do terceiro lado do tri�ngulo: ");
		int lado3 = sc.nextInt();

		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("TRI�NGULO ESCALENO");
		}
		
		else if (lado1==lado2 && lado1==lado3 && lado2==lado3) {
			System.out.println("TRI�NGULO EQUIL�TERO");
		}
		
		else {
			System.out.println("TRI�NGULO IS�CELES");
		}
	
		sc.close();
	}
}
