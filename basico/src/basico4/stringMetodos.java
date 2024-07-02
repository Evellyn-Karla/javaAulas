package basico4;

import java.util.StringTokenizer;

public class stringMetodos {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = " hello world ";
		
		String resultado1 = str.substring(6); // "World"
		String resultado2 = str.substring(3, 8); // "lo World"
		
		System.out.println(resultado1 + " || " + resultado2);
	
		
		String resultado3 = str.toUpperCase(); // "HELLO WORlD"
		String resultado4 = str.toLowerCase(); // "hello world"
 
		System.out.println(resultado3 + " || " + resultado4);

		String resultado5 = str1.trim(); // "hello world"

		
		System.out.println(str1 + "||" + resultado5);
		
		char res = str.charAt(6); // "W"
		
		System.out.println(res);
		
		String s = "Hello";
		String s1 = "hello";
		
		boolean b1 = s.equals("Hello"); // true
		boolean b2 = s.equals(s1); // false
		boolean b3 = s.equalsIgnoreCase(s1); // true
		boolean b4 = s.equalsIgnoreCase("azul"); // false
		
		int tam = str.length(); // 10
		
		String dois = "Hello World World2";
		
		int posi = dois.indexOf("l"); // 2
		System.out.println(posi); 
		
		posi = dois.lastIndexOf("l"); // 15
		System.out.println(posi); 
		
		String valor = "CDD - Java";
		
		System.out.println(valor.endsWith("Java")); // true
		System.out.println(valor.startsWith("C")); // true
		System.out.println(valor.startsWith("DD", 1)); // true, compara a partir do 1
		
		StringTokenizer exe = new StringTokenizer("Não iremos desistir nunca.");
		
		System.out.println(exe.countTokens()); // 4
		
		
		
		
		
		
	}

}
