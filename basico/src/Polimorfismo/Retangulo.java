package Polimorfismo;

public class Retangulo extends Formas {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	public double area(double base, double altura) {
		double calc = base * altura;
		return calc;
	}

	public double perimetro(double base, double altura) {
		double calc = 2 * (base + altura);
		return calc;
	}

}
