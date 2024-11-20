package Views;

import models.Alumno;
import models.Asignatura;

public class TestAlumno{
public static void main(String[]args) {
	//Inicializar un objeto del tipo Alumno
	Alumno a = new Alumno();

	//Cargar datos
    a.setNombre("Juan");
    a.setApellido("Perez");
    a.setCedula(525000);
    a.setInstitucion("SNPP");
    Asignatura.setCodigo(2102);
    a.setMaterias("Informatica");

    // Imprimir los datos
    System.out.println("Datos del alumno:");
    System.out.println("Nombre: " + a.getNombre());
    System.out.println("Apellido: " + a.getApellido());
    System.out.println("Cedula: " + a.getCedula());
  
    //Institucion
    System.out.println("Institucion: " + a.getInstitucion());
    System.out.println("Código: " + Asignatura.getCodigo());
    System.out.println("Materias: " + a.getMaterias());
    // Inicializar un objeto del tipo Alumno usando el constructor con parámetros
    Alumno alumno2 = new Alumno();

    // Imprimir los datos
    System.out.println("\nDatos del segundo alumno2:");
    System.out.println("Nombre: " + alumno2.getNombre());
    System.out.println("Apellido: " + alumno2.getApellido());
    System.out.println("Cedula: " + alumno2.getCedula());
  //Institucion
    System.out.println("Institucion: " + a.getInstitucion());
    System.out.println("Código: " + Asignatura.getCodigo());
    System.out.println("Materias: " + a.getMaterias());
}
}