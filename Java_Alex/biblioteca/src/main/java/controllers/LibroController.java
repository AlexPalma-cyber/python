package controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Conexion;
import models.libro;

public class LibroController {
	public LibroController () {}
	public String guardarLibro(int codigo, String autor, String titulo, int anio, String estado, String editorial) throws SQLException, ClassNotFoundException {
		libro l= new libro (codigo, autor, titulo, anio, estado, editorial);

		String insertSql = "insert into libros values (?,?,?,?,?,?)";
		Conexion conn = new Conexion();
		PreparedStatement ps = conn.getConexion().prepareStatement(insertSql);
		ps.setInt(1, l.getCodigo());
		ps.setString(2, l.getAutor());
		ps.setString(3, l.getTitulo());
		ps.setInt(4, l.getAnio());
		ps.setString(5, l.getEstado());
		ps.setString(6, l.getEditorial());
		
		ps.executeUpdate();//se puede validar cantidad insertada
		
		return "El libro fue insertado correctamente.";
	}
}
