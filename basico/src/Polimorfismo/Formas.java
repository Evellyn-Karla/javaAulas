package Polimorfismo;

public abstract class Formas {
	public double base;
	public double altura;
	
	public Formas(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimetro() {
		return 0;
	}
}
