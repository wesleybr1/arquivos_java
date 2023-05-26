package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		System.out.print("Informe a cor do carro: ");
		carro.cor= sc.nextLine();
		System.out.print("Informe a placa do carro: ");
		carro.placa = sc.nextLine();
		System.out.print("Informe o tipo do cambio do carro: ");
		carro.tipoC = sc.nextLine();
		System.out.print("Informe o modelo do carro: ");
		carro.modelo = sc.nextLine();
		
		System.out.print("\nInforme a cor do carro: ");
		carro2.cor= sc.nextLine();
		System.out.print("Informe a placa do carro: ");
		carro2.placa = sc.nextLine();
		System.out.print("Informe o tipo do cambio do carro: ");
		carro2.tipoC = sc.nextLine();
		System.out.print("Informe o modelo do carro: ");
		carro2.modelo = sc.nextLine();;
		
		
		System.out.println(carro);
		System.out.println(carro2);
		
		sc.close();
	}
	

}
