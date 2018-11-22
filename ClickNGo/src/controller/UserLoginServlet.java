package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminLoginDAO;
import dao.UserLoginDAO;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = (request.getParameter("email"));
		String Password = (request.getParameter("Password"));	
		boolean status = UserLoginDAO.instance.UserLogin(email,Password);
		request.getRequestDispatcher("UserLogin.jsp");
		
		System.out.println("status: " + status);
	
		if(status == false) {
			request.getRequestDispatcher("invalidLogin.jsp").forward(request, response);
		}else if(status==true) {
		request.getRequestDispatcher("UserMenu.jsp").forward(request, response);
		}
		}

}
