package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		//ATIVIDADE 1
		/*System.out.println("Informe sua nota (0-10): ");
		double nota = sc.nextDouble();
		
		while (nota < 0 || nota >= 10.1) {
			System.out.println("O valor informado é inválido, informe um valor válido entre 0 e 10.");
			System.out.println("Informe sua nota (0-10): ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Sua nota é: " + nota);*/
		
		
		//ATIVIDADE 2
		/*System.out.println("Informe o nome de usuário: ");
		String usuario = sc.nextLine();
		System.out.println("Informe o sua senha: ");
		String senha = sc.nextLine();
		
		while (usuario.equals(senha)) {
			System.out.println("Senha informada igual o login. INFORME A SENHA CORRETA!");
			System.out.println("Informe a senha correta: ");
			senha = sc.nextLine();
		}
		
		System.out.println("SENHA CORRETA!!!");*/
		
		
		//ATIVIDADE 3
		/*for(int contador = 1; contador <= 20; contador++) {
			System.out.println(contador);
		}
		for(int contador = 1; contador <= 20; contador++) {
			System.out.print(contador + " ");
		}*/
		
		
		//ATIVIDADE 4
		/*for(int contador = 1; contador <= 50; contador = contador +2) {
			System.out.println(contador);
		}*/
		
		
		//ATIVIDADE 5
		/*System.out.println("Informe o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int n2 = sc.nextInt();
		
		for(int contador = n1; contador <= n2; contador++) {
			System.out.println(contador);
		}*/
		
		
		//ATIVIDADE 6
		/*String nome;
		do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);
		
		
		int idade;
		do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);
		
		
		double salario;
		do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = sc.nextDouble();
        } while (salario <= 0);
		
		
		char sexo;
		do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = sc.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
		
		
		char estadoCivil;
		do {
            System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = sc.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		
		System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);*/
		
		
		//EXERCÍCIOS
		
		//1
		/*int soma = 0;
		for(int contador = 1; contador <= 50; contador = contador + 2) {
			soma = soma + contador;
		}
		System.out.print(soma);*/
		
		
		//2
		/*System.out.println("Informe a primeira altura: ");
		double altura1 = sc.nextDouble();
		System.out.println("Informe a segunda altura: ");
		double altura2 = sc.nextDouble();
		System.out.println("Informe a terceira altura: ");
		double altura3 = sc.nextDouble();
		System.out.println("Informe a quarta altura: ");
		double altura4 = sc.nextDouble();
		System.out.println("Informe a quinta altura: ");
		double altura5 = sc.nextDouble();
		
		double media = (altura1 + altura2 + altura3 + altura4 + altura5) / 5;
		System.out.print("A média das alturas informadas é: " + media);*/
		
		
		//3
		/*System.out.println("Informe 1 para sim e 0 para não: ");
		char num = sc.next().charAt(0);
		int contador = 0;
		
		while (num == '1') {
			System.out.println("Digite 1 para sim e 0 para não: ");
			num = sc.next().charAt(0);
			contador ++;
		}
		System.out.println(contador );*/
		
	
		//4
		/*int contador = 0;
		double soma = 0;
		
		while (contador < 5) {
			System.out.println("Informe uma altura: ");
			double altura = sc.nextDouble();
			soma = soma + altura;
			contador ++;	
		}
		
		double media = soma / 5;
		System.out.printf("A media das alturas é: %.2f", media);*/
		
		
		sc.close();
		}
	}
