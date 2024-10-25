package calculadora;

public class Test {
    public static void main(String[] args) {
        // Declaración de la calculadora normal
        Calculadora miCalculadora;
        CalculadoraCientifica calcCientifica; 

        // Instanciar calculadora
        miCalculadora = new Calculadora();
        calcCientifica = new CalculadoraCientifica();
        
        
        // El método setNumeros recibe dos números
        miCalculadora.setNumeros(22, 40);

        // Imprimir la suma
        double resultadoSuma = miCalculadora.getSuma();
        System.out.println("La suma es: " + resultadoSuma);
        miCalculadora.setNumeros(45, 45);
        
        //Imprimir la resta
        double resultadoResta = miCalculadora.getResta();
        System.out.println("La resta es: " + resultadoResta);
        miCalculadora.setNumeros(35, 45);
        
        // Imprimir la multiplicacion
        double resultadoMultiplicacion = miCalculadora.getMultiplicacion();
        System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
        miCalculadora.setNumeros(25, 45);
        
        //Impirmir la division
        double resultadoDivision = miCalculadora.getDivision();
        System.out.println("La division es: " + resultadoDivision);
        miCalculadora.setNumeros(45, 15);
        
        //Imprimir la potencia
        double resultadoPotencia = calcCientifica.getPotencia();
        System.out.println("La potencia es: " + resultadoPotencia);

        // Crear un objeto calculadora científica llamado calcCientifica
       calcCientifica = new CalculadoraCientifica();

        // Ejemplo de uso de la calculadora científica
        double resultadoRaiz = calcCientifica.raizCuadrada(25);
        System.out.println("La raíz cuadrada de 25 es: " + resultadoRaiz);
        System.out.println("Historial: " + calcCientifica.getHistorial());
    }
}