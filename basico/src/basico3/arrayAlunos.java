package basico3;

import java.util.Scanner;

public class arrayAlunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double media, soma = 0, notas[] = new double[5];
		
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a nota do %dº aluno: ", (i+1));  
			notas[i] = input.nextDouble();
		}
		
		for (double j : notas) {
			soma += j;
		}
		media = soma/5;
		
		System.out.printf("A média da turma é: %.2f", media);
	}

}
