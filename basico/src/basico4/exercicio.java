package basico4;


import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// removendo espaços 
		String texto = " Texto para retirar espaços do inicio e do fim ";
		
		String removido = texto.trim();
		
		System.out.println(removido);

		// ------------------------------
		
		// Contagem de palavras 
		
//		System.out.println("Digite a frase: ");
//		String frase = sc.nextLine();
//		
//		StringTokenizer exe = new StringTokenizer(frase);
//		
//		int tam = exe.countTokens();
//		
//		System.out.println("A frase - " + frase + " - possui " + tam + " palavras" );
		// ---------------------------------------------------------------------
		
		// Comparando textos 
		
//		String texto1 = "Os textos são iguais?";
//		String texto2 = "Os textos são iguais?";
//		
//		boolean igual = texto1.equals(texto2);
//		if(igual) {
//			System.out.println("São iguais.");
//		}else {
//			System.out.println("Não são iguais.");
//		}
	
		// ----------------------------------
		
		// Texto para maiusculos
		
//		System.out.println("Digite a frase: ");
//		String frase2 = sc.nextLine();
//		
//		System.out.println(frase2.toUpperCase());
		
		// array para texto maiusculo
		
		String[] palavras = {"a", "vida", "é", "bela"};
		
		String pratexto = (Arrays.toString(palavras)).replace(",", "").replace("[", "").replace("]", "");
		
		System.out.println(pratexto.toUpperCase());
		
		String pratexto2= pratexto.substring(9) +  pratexto.substring(6, 9) + pratexto.charAt(0) + pratexto.substring(1, 6); 
		
		System.out.println(pratexto2.toUpperCase());
				
	}
}
