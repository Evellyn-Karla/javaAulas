package Polimorfismo;

public class TesteFormas {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(12, 9, 9, 15);
		
		double areaTri = triangulo.area(12, 9);
		double periTri = triangulo.perimetro(12, 9, 15);
		
		System.out.printf("A área do triangulo é: %.2f\nO perimetro do triângulo é: %.2f", areaTri, periTri);
		
		Retangulo retangulo = new Retangulo(12, 5);
		double areaRet = retangulo.area(12, 5);
		double periRet = retangulo.perimetro(10, 4);

		System.out.printf("\n\nA área do retângulo é: %.2f\nO perimetro do retângulo é: %.2f", areaRet, periRet);
	}

}
