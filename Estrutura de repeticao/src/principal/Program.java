package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//for � usado quando j� sabemos a quantidade de vezes que deve ser executado
		/*for(int contador = 0; contador <= 3; contador++) {
			System.out.println("digite o nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Nome: " + nome);
		}*/

		
		//usamos a estrutura while quando n�o sabemos a quantidade de vezes que ser� repetida
		/*System.out.println("Deseja cadastrar um usu�rio? (s/n)");
		char opcao = sc.next().charAt(0);
		int contador = 1;
		while(opcao == 's') {
			System.out.println("Posi��o do cadastro: " + contador);
			contador++;
			System.out.println("Deseja cadastrar um usu�rio? (s/n)");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Quantidade de cadastros: " + contador);*/
		
		
		//estrutura do while garante que o bloco ser� executado ao menos uma vez
		char opcao;
		int contador = 0;
		
		do {
		System.out.println("Deseja cadastrar um usu�rio? (s/n)");
		opcao = sc.next().charAt(0);
		contador++;
		} while (opcao == 's');
		
		contador ++ ;
		
		sc.close();
	}

}
