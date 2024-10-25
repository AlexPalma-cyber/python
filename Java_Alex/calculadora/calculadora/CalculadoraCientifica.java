package calculadora;

public class CalculadoraCientifica extends Calculadora {
    // Atributos
    String historial;

    // Constructor
    public CalculadoraCientifica() {
        super(); // Llama al constructor de Calculadora
        this.historial = "Inicio: ";
    }

    // Métodos
    public double getPotencia() {
        float base = super.num1;
        float exponente = super.num2;
        super.resultado = Math.pow(base, exponente);
        this.historial += base + "E" + exponente + " = " + super.resultado;
        return super.resultado;
    }

	public double raizCuadrada(double numero) {
		// TODO Auto-generated method stub
		if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        double resultadoRaiz = Math.sqrt(numero);
        this.historial += "√" + numero + " = " + resultadoRaiz + "; ";
        return resultadoRaiz;
	}
	
	public String getHistorial() {
		return this.historial;
	}
}