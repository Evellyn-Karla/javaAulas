package basico4;

public class Strings {

	public static void main(String[] args) {
		char caracteres[] = {'a','b','c'};
		String texto = new String(caracteres);  //transformando um array em string
		System.out.println(texto);
		
		//replace - método para substituir/
		String str = "Hello";
		String resultado = str.replace("l","W"); //o primeiro parâmetro é o que vai ser substituido e o segundo é o que vai substituir.
		System.out.println(resultado);
		
		//Para concatenação de strings se usa o sinal +/
		String str1 = "oi";
		String texto1 = str1 + " " + "Mundo";
		System.out.println(texto1);


	}

}
