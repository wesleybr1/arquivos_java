package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declara��o de constante
		/*final double PI = 3.14151617;
		
		//potencia de numeros, primeiro dado � o n�mero que se deseja potencia, segundo n�mero a pot�ncia
		System.out.println(Math.pow(3, 3));
		
		//dentre 2 parametros mostra o maior n�mero
		System.out.println(Math.max(5, 10));
		
		//dentre 2 parametros mostra o menor n�mero
		System.out.println(Math.min(1, 5));
		
		//realiza a raiz quadrada do n�mero informado
		System.out.println(Math.sqrt(16));
		
		//arredonda o n�mero, para mais ou para menos
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
		// !  = nega��o
		
		//operadores de incremento e decremento
		// x += 2 � o mesmo que x = x + 2
		// faz-se o mesmo com subtra��o
		// divis�o 
		// multiplica��o
		// ++ = somando mais 1
		// -- = diminui 1 ou menos 1
		
		System.out.println("Informe um n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe outro n�mero: ");
		int num2 = sc.nextInt();
				
		if (num1 > num2) {
			System.out.println("O primeiro n�mero � maior que o segundo");
		}
		else if (num1 == num2) {
			System.out.println("Os n�meros informados s�o iguais");
		}else {
			System.out.println("O segundo n�mero � maior que o primeiro");
		}
		
		sc.close();
	}

}
