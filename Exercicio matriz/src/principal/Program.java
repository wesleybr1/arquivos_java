package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		Random rd = new Random();
		
		int num = rd.nextInt(61);
		
		for (int i = 0; i < 6; i++) {
			num = rd.nextInt(61);
			System.out.println("Número gerado: " + num);
		}
		*/
		
		Random rd = new Random();
		
		int num = rd.nextInt(10);
		
		String[] nomes = new String[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um nome: ");
			String nome = sc.nextLine();
			nomes[i] = nome;
		}
			System.out.print("O nome sorteado foi: " + nomes[num]);
		}

		
		//EXERCICIO
		
		
		//ATIVIDADE 1
		
		/*int[] numeros = new int[100];
		for (int contador = 0; contador < numeros.length; contador++) {
			System.out.println(contador);
		}*/
		
		
		//ATIVIDADE 2
		
		/*System.out.println("Informe a quantidade de nomes que vão ser cadastrados: ");
		int quant = sc.nextInt();
		sc.nextLine();
		String[] nome = new String [quant];
		for (int i = 0; i < quant; i++) {
			System.out.print("Digite um nome: ");
			String nomes = sc.nextLine();
			nome [i] = nomes;
		}
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}*/
		
		
		//ATIVIDADE 3
		
		/*System.out.println("Informe o nome do(a) aluno(a): ");
		String nome = sc.nextLine();
		
		int num = 0;
		
		double[] notas = new double[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a nota do(a) " + nome + " referente ao " + (++num) + "° bimestre: ");
			double nota = sc.nextDouble();
			notas[i] = nota;
		}
		int num1 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("Nota do " + (++num1) + "° bimestre " + notas[i]);
		}*/
		
		
		// DESAFIO
		
		/*int[][] mult = new int[3][3];
		int contador = 50;
		for(int i = 0; i < mult.length; i++) {
			for(int j = 0; j < mult.length; j++) {
				mult[i][j] = contador;
				System.out.print(mult[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		System.out.println("Numeros da diagonal de cima para baixo");
		System.out.println("Esquerda para direita");
		
		for(int i = 0; i < mult.length; i++) {
			for(int j = 0; j < mult.length; j++) {
				if(mult[i] == mult[j]) {
					System.out.println(mult[i][j] + "\t");
				}
			}
		}*/
		
		
	//sc.close();

	}