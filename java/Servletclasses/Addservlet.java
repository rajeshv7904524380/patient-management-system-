package Servletclasses;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Project.Crudoperation;
import Project.Patient;

/**
 * Servlet implementation class Addservlet
 */
@WebServlet("/AddServlet")
public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Addservlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String disease=request.getParameter("disease");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String deposited=request.getParameter("deposited");
		String pending=request.getParameter("pending");
		String patienttype=request.getParameter("patienttype"); 
		try {
			
			Crudoperation.insert(id, name, disease, address, gender, deposited, pending, patienttype);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("ViewPatient.jsp");
		rs.forward(request, response);
	}
}
