package principal;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {

			
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Informe a primeira nota: ");
		double nota1 = ler.nextDouble();
	 
		System.out.println("Informe a segunda nota: ");
		double nota2 = ler.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = ler.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		double nota4 = ler.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
		System.out.printf("A média das notas informadas é: %.2f", media);
			
		ler.close();
		}

	}
