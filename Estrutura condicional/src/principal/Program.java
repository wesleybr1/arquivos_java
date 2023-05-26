package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declaração de constante
		/*final double PI = 3.14151617;
		
		//potencia de numeros, primeiro dado é o número que se deseja potencia, segundo número a potência
		System.out.println(Math.pow(3, 3));
		
		//dentre 2 parametros mostra o maior número
		System.out.println(Math.max(5, 10));
		
		//dentre 2 parametros mostra o menor número
		System.out.println(Math.min(1, 5));
		
		//realiza a raiz quadrada do número informado
		System.out.println(Math.sqrt(16));
		
		//arredonda o número, para mais ou para menos
		System.out.println(Math.round(25.9569));
		
		//pode-se fazer calculos usando o Math como parametro 
		System.out.println(2* Math.PI);
		
		//para usar ponto no lugar de virgula, quando for entrar com o dado precisa importar a classe (ctrl+shift+o)
		Locale ponto = new Locale ("en", "us");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o salario: ");
		double salario = sc.useLocale(ponto).nextDouble();
		
		System.out.println(salario);
		sc.close();*/
		
		// operadores logicos
		// && = e
		// || = ou
		// !  = negação
		
		//operadores de incremento e decremento
		// x += 2 é o mesmo que x = x + 2
		// faz-se o mesmo com subtração
		// divisão 
		// multiplicação
		// ++ = somando mais 1
		// -- = diminui 1 ou menos 1
		
		System.out.println("Informe um número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe outro número: ");
		int num2 = sc.nextInt();
				
		if (num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo");
		}
		else if (num1 == num2) {
			System.out.println("Os números informados são iguais");
		}else {
			System.out.println("O segundo número é maior que o primeiro");
		}
		
		sc.close();
	}

}
