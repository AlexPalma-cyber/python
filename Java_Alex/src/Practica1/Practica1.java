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
    	System.out.println("Hola" + nombre);
    	System.out.println("Tu edad es" + edadActual);
}}
