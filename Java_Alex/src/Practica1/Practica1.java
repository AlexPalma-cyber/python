package Practica1;

import java.util.Scanner;

public class Practica1 {
      public static void main(String[]args) {
    	  //Class Object es la raiz de la jerarquia de clases,
    	  
		int edadActual = 36;
    	float estatura = (float) 1.7; 
    	String nombre = "MOISES";
    	java.util.Scanner sc;
    	//construir Scanner
    	sc = new Scanner(System.in);
    	System.out.println("Como te llamas?");
    	nombre = sc.next();
    	estatura = sc.nextInt();
    	System.out.println("Hola" + nombre);
    	System.out.println("Tu edad es" + edadActual);
    	System.out.println("Tu estatura es" + estatura);
}
      if(edad == 18) {
    	  System.out.println("Ya tienes 18");
      }
      if(edad >=18 && edad <= 95) {
    	  System.out.println("Ya eres mayor de edad");
      }else if(edad < 18 && edad > 4) {
    	  System.out.println("Eres menor de edad");
      }else {
    	  System.out.println("Nada");
      }
}}
