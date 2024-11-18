package views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import models.Conexion;


public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conexion C = new Conexion();
		if(C.getConexion() !=null) {
			System.out.println("OK ");
			PreparedStatement pr;
			Scanner sc = new Scanner (System.in);
			String insertar_usuario = "INSERT INTO USUARIO VALUES(?,?,?,?)";
			System.out.println("ALIAS: ");
			String usuario = sc.next();
			System.out.println("NOMBRE: ");
			String nombre =	sc.next();
			System.out.println("EMAIL: ");
			String email = sc.next();
			System.out.println("PASS: ");
			String password = sc.next();
			
			sc.close();	
			pr = C.getConexion().prepareStatement(insertar_usuario);
			pr.setString(1, usuario);
			pr.setString(2, nombre);
			pr.setString(3, email);
			pr.setString(4, password);
			
			pr.executeUpdate();//aqui recien ejecutamos
			pr.close();
			String sentencia = "SELECT ALIAS, NOMBRE, EMAIL FROM USUARIO";
			pr = C.getConexion().prepareStatement(sentencia);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ALIAS")+ " | " + rs.getString("NOMBRE") +" | "+ rs.getString("EMAIL"));

				System.out.println("----------");
				
			 } pr.close();
				C.closeConexion();
		}else {
				 System.out.println("Error");
			 }
		}
	}

			 
			 
		 
	
