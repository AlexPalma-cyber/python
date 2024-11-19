package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletGuardarLibro
 */
@WebServlet("/ServletGuardarLibro")
public class ServletGuardarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGuardarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		guardarLibro(request, response);
	}

	private void guardarLibro(HttpServletRequest rq, HttpServletResponse rs) {
		int codigo = Integer.valueOf(rq.getParameter("code"));
		String autor =rq.getParameter("Autor");
        String titulo =rq.getParameter("titulo");
        int año = Integer.valueOf(rq.getParameter("year"));
		String anio =rq.getParameter("año");
		String editorial =rq.getParameter("editorial");
		
		new LibroController().guardarLibro(codigo, autor, titulo, año, anio, editorial);
		
		try {
			rs.sendRedirect("ViewLibro.jsp");
		}catch(IOException e) {
		e.printStackTrace();
	}

	}
}


