package Figura;

public class Triangulo {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcular_area() {
        return (base * altura) / 2;
    }

    public float calcularPerimetro(float lado1, float lado2) {
        return lado1 + lado2 + base;
    }
}

