package Practica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        int edadActual = 36;
        float estatura = (float) 1.7; 
        String nombre = "MOISES";
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre
        System.out.println("Como te llamas?");
        nombre = sc.next();

        // Solicitar edad
        System.out.println("Cuantos años tienes?");
        int edad = sc.nextInt();

        // Solicitar estatura
        System.out.println("Cual es tu estatura en metros?");
        estatura = sc.nextFloat();

        // Mostrar información
        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu estatura es " + estatura);

        // Validar la edad
        if (edad == 18) {
            System.out.println("Ya tienes 18");
        }
        if (edad >= 18 && edad <= 95) {
            System.out.println("Ya eres mayor de edad");
        } else if (edad < 18 && edad > 4) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Nada");
        }

        sc.close(); // Cerrar el Scanner
    }
}

