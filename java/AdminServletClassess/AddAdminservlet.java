package AdminServletClassess;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdminDAO.UserDao;
import Project.Crudoperation;
import Project.Patient;

/**
 * Servlet implementation class Addservlet
 */
@WebServlet("/Addservlet")
public class AddAdminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddAdminservlet() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int id=Integer.parseInt(request.getParameter("id"));
    	String email=request.getParameter("email");
    	String name=request.getParameter("name");
    	String password=request.getParameter("password");
		try {
			UserDao.insert(id,name,email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Login.jsp");
		rs.forward(request, response);
	}
}
