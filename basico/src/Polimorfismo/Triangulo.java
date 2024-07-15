package Polimorfismo;

public class Triangulo extends Formas {
	public double lado1;
	public double lado2;

	public Triangulo(double base, double altura, double lado1, double lado2) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double area(double base, double altura) {
		double calc = (base * altura) / 2;
		return calc;
	}

	public double perimetro(double base, double lado1, double lado2) {
		double calc = lado1 + lado2 + base;
		return calc;
	}

}
