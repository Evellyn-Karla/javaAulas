package basico4;

public class stringMetodos {

	public static void main(String[] args) {
		String str = "Hello Word";
		String str1 = " hello word ";
		
		String resultado1 = str.substring(6); // "Word"
		String resultado2 = str.substring(3, 8); // "lo Word"
		
		System.out.println(resultado1 + " || " + resultado2);
	
		
		String resultado3 = str.toUpperCase(); // "HELLO WORD"
		String resultado4 = str.toLowerCase(); // "hello word"
 
		System.out.println(resultado3 + " || " + resultado4);

		String resultado5 = str1.trim(); // "hello word"

		
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
		
		System.out.println(tam);
		
		
		
		
		
		
		
		
	}

}
