package Figura;

public class Rectangulo extends Figura{
	private float base;
	private float altura;
	
	public Rectangulo(float b, float h) {
		this.base = b;
		this.altura = h;
	}
	public double calcular_area() {
		return this.base * this.altura;
	}
	public void set_base(float b) {
		this.base = b;
	}
}
