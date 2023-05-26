package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//%d = chama int
		//%s = chama String
		//%c = chama caractere
		//.2f = chama casas decimais (double)
		
		
		System.out.println("Entre com o sexo;");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Entre com sua idade:");
		int idade = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Entre com seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com sua altura:");
		double altura = sc.nextDouble();
		
		System.out.println("Meu nome é: " + nome +", minha idade é: " + idade +" anos, meu sexo é: " + sexo +", minha altura é: " + altura);
		sc.close();
	}

}
