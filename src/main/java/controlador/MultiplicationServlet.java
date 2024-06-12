package controlador;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import modelo.Number;
import java.io.PrintWriter;


//se manjean las solicitudes en la url /tablaMultiplicar
@WebServlet("/tablaMultiplicar")

public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MultiplicationServlet() {
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
		
		//números del formulario
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		//instancia number
		Number numbers = new Number(number1, number2);
		
		//respuesta
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		//se genera respuesta dinámica
		out.println("<html><body>");
		out.println("<h1>Tabla de Multiplicar de " + number1 + "</h1>");
		
		out.println("<ul>");
		for (int i=1; i<=10; i++) {
			out.println("<li>" + number1 + "x" + i + "=" + (number1 * i) + "</li>");
			
		}
		
		out.println("</ul>");
		
		
		
out.println("<h1>Tabla de Multiplicar de " + number2 + "</h1>");
		
		out.println("<ul>");
		for (int i=1; i<=10; i++) {
			out.println("<li>" + number2 + "x" + i + "=" + (number2 * i) + "</li>");
			
		}
		
		out.println("</ul>");
		
		out.println("</body></html>");
		
	}

}
