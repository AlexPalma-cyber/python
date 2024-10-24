package Practica2;

public class Practica2 {
    public static void main(String[] args) {
        // Usando tipos de datos int
        int num1 = 9;
        int num2 = 2;
        int resultadoInt = num1 / num2; // División con int
        System.out.println("Resultado de la división con int: " + resultadoInt); // Salida: 4

        // Usando tipos de datos float
        float resultadoFloat = (float) num1 / num2; // División con float
        System.out.println("Resultado de la división con float: " + resultadoFloat); // Salida: 4.5
        //for, while sentencias de repeticion
        for(int x = 0 ; x < 100 ; x++) {
        	System.out.println("Hola cien veces");
        }
        int numero = 0;
		while(numero < 100) {
        	System.out.println("Hola cien veces");
        	numero++;
        }
        int numeo = 2;
		do {
        	System.out.println("Hola cien veces");
        	numero++;
        }while(numeo<100);
    }
    
}
