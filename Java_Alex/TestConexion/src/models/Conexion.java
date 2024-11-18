package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conn;
	 String CONNECTOR = "com.mysql.jdbc.Driver";
	 String USER ="root";
	 String PASS ="root";
	 String URL = "jdbc:mysql://localhost:3306/cursojava_bd";
	
	
	
	public Conexion()throws ClassNotFoundException, SQLException {
			
				Class.forName(CONNECTOR);
			    conn =  DriverManager.getConnection(URL,USER,PASS); 
		
	}
	
	public Connection getConexion() {
		return conn;
	}
	
	public void closeConexion() throws SQLException{
		
			conn.close();
		
	
	}
}
