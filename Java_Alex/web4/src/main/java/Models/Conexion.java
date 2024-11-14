package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String CONNECTOR = "com.mysql.jbc.Driver";
	private static final String USER ="root";
	private static final String PASS ="root";
	private static final String URL = "jdbc:mysql://localhost:3306/cursojava_bd";
	
	private Connection conn;
	
	public Conexion() {
			try {
				Class.forName(CONNECTOR);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn = (Connection) DriverManager.getConnection(URL,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}
	
	public Connection getConexion() {
		return conn;
	}
	
	public void closeConexion(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	}


