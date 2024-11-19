package controllers;

import models.libro;

public class LibroController {
	public LibroController () {}
	
	public void guardarLibro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
		libro l= new libro (codigo, autor, titulo, anio, estado, editorial);

	}
}
