package views;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test {

	
	private void validarConexion(HttpServletRequest request, HttpServletResponse response){
		try {
			response.getWriter().append("Probando conexion");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 private void validarConexion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		 response.getWriter().append("Probando");
		 Conexion C = new Conexion();
		 response.getWriter().append(" " + C.getConexion());
		 response.getWriter().append("Conexion OK");
		 String sentencia = "SELECT ALIAS, NOMBRE, EMAIL FROM USUARIO";
		 PreparedStatement pr = C.getConexion().preparedStatement(sentencia);
		 ResultSet rs = pr.executeQuery();
		 
		 while(rs.next()) {
			 response.getWriter().append(rs.getString(1));
			 response.getWriter().append(rs.getString(2));
			 response.getWriter().append(rs.getString(3));
			 
			 response.getWriter().append("----------");
		 }
		 
		 
	 }
}
