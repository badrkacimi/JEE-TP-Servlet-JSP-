package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="cs",urlPatterns={"/fs","*.php"})
public class FirstServlet extends HttpServlet  {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("nom");
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("<li>nom:"+nom+ "</li>");
		out.println("<li>Protocole:"+request.getProtocol()+ "</li>");
		out.println("<li>IP client:"+request.getRemoteAddr()+ "</li>");
		out.println("</html></body>");		
	}

}
