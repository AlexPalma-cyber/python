package Figura;

public class Test {
	
	public static void main(String[] args) {
		Rectangulo r;
		r = new Rectangulo(20,10);
		r.set_base(5);
		System.out.println("El A del Rectangulo es " +r.calcular_area() + "u²");
		
		Cuadrado c = new Cuadrado(5);
		System.out.println("El S del cuadrado es "+c.calcular_area() + "u²");
		
		Triangulo t = new Triangulo(5, 10);
		System.out.println("El A del triángulo es " + t.calcular_area() + "u²");
		
	}

}
