package Metodos;

import java.util.Scanner;

public class TesteCalculos {

	public static void main(String[] args) {
		CalcularMetodos calc = new CalcularMetodos();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		while (op!=5) {
			System.out.println("\nEscolha sua opção:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
			op = sc.nextInt();
			if(op == 5) {
				System.out.println("Xauzinn!");
				break;
			}
			System.out.println("2 ou 3 números?");
			int qtd = sc.nextInt();
			if (qtd == 2) {
				System.out.println("Digite o primeiro numero:");
				int num1 = sc.nextInt();
				System.out.println("Digite o segundo numero:");
				int num2 = sc.nextInt();
				
				if(op == 1) {
					System.out.printf("O resultado da soma é: %d", calc.somar(num1, num2));
				}
				if(op == 2) {
					System.out.printf("O resultado da subtração é: %d", calc.subtrair(num1, num2));
				}
				if(op == 3) {
					System.out.printf("O resultado da multiplicação é: %d", calc.mult(num1, num2));
				}
				if(op == 4) {
					System.out.printf("O resultado da divisão é: %d", calc.div(num1, num2));
				}
			}
			if (qtd == 3) {
				System.out.println("Digite o primeiro numero:");
				int num1 = sc.nextInt();
				System.out.println("Digite o segundo numero:");
				int num2 = sc.nextInt();
				System.out.println("Digite o terceiro numero:");
				int num3 = sc.nextInt();
				
				if(op == 1) {
					System.out.printf("O resultado da soma é: %d", calc.somar(num1, num2, num3));
				}
				if(op == 2) {
					System.out.printf("O resultado da subtração é: %d", calc.subtrair(num1, num2, num3));
				}
				if(op == 3) {
					System.out.printf("O resultado da multiplicação é: %d", calc.mult(num1, num2, num3));
				}
				if(op == 4) {
					System.out.printf("O resultado da divisão é: %d", calc.div(num1, num2, num3));
				}
			}
			
		}
	}
}
