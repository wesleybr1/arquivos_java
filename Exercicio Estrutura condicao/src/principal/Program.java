package principal;

//import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Locale ponto = new Locale("en" , "us");
		
		//ATIVIDADE 1		
		/*System.out.println("Informe um ano: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("O ano informado � um ano BISSEXTO!");
		}
		else {
			System.out.println("O ano informado n�o � um ano BISSEXTO");
		}*/
		
		
		//ATIVIDADE 2
		/*System.out.println("Informe um n�mero: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero informado � PAR");
		}
		else {
			System.out.println("O n�mero informado � IMPAR");
		}*/
		
		
		//ATIVIDADE 3	
		/*System.out.println("Informe o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe o primeiro n�mero: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero informado � " + num1);
		}
		else {
			System.out.println("O maior n�mero informado � " + num2);
		}*/
		
		
		//ATIVIDADE 4
		/*System.out.println("Informe o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O n�mero %d foi o maior n�mero informado." , num1);
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("O n�mero %d foi o maior n�mero informado." , num2);
		}
		
		else {
			System.out.printf("O n�mero %d foi o maior n�mero informado." , num3);
		}*/
		
		
		//ATIVIDADE 5
		/*System.out.println("Informe o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		int num3 = sc.nextInt();*/
		
		
		//ATIVIDADE 6
		/*System.out.println("Informe seu sexo: ");
		String sexo = sc.nextLine();
		System.out.println(sexo.toLowerCase());*/
		
		
		//ATIVIDADE 7
		/*System.out.println("Informe a primeira nota: ");
		double nota1 = sc.useLocale(ponto).nextDouble();
	 
		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.useLocale(ponto).nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = sc.useLocale(ponto).nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		double nota4 = sc.useLocale(ponto).nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media < 6 ) {
		System.out.printf("Aluno reprovado com a m�dia: %.2f", media);
		}
		
		else if (media >= 6 && media < 7) {
			System.out.printf("Aluno est� de recupera��o com a m�dia: %.2f", media);
		}
		
		else if ((media >= 7) && (media <= 9.99)){
			System.out.printf("Aluno aprovado com a m�dia: %.2f", media);
		}
		
		else {
			System.out.printf("Aluno aprovado com honras, com a m�dia: %.2f", media);
		}*/
		
		sc.close();
	}

}
