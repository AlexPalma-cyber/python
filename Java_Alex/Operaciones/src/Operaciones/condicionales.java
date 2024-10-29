package Operaciones;

import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        int edad;
        String nombre;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = Sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = Sc.nextInt();

        if (edad >= 18 && edad <= 90) {
            System.out.println(nombre + " eres mayor de edad");
        } else if (edad < 18 && edad > 0) {
            System.out.println(nombre + " eres menor de edad");
        } else {
            System.out.println("Los datos ingresados son erróneos");
        }
    }
}
