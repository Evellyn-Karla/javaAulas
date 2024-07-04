package Metodos;

public class CalcularMetodos {
	int somar (int a, int b) {
		return a+b;
	}
	
	int somar(int a, int b, int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
		CalcularMetodos calc = new CalcularMetodos();
		int soma = calc.somar(2, 5);
		System.out.println(soma);
		
		soma = calc.somar(2, 5, 7);
		System.out.println(soma);
	}
}
