package controller;

import java.io.IOException;
import model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.AdminLoginDAO;

//@Path("/AdminRegServlet")
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int staffid = Integer.parseInt(request.getParameter("staffid"));
		String Password = (request.getParameter("Password"));	
		boolean status = AdminLoginDAO.instance.AdminLogin(staffid,Password);
		request.getRequestDispatcher("AdminLogin.jsp");
		
		System.out.println("status: " + status);
	
		if(status == false) {
			request.getRequestDispatcher("invalidLogin.jsp").forward(request, response);
		}else if(status==true) {
		request.getRequestDispatcher("AdminMenu.jsp").forward(request, response);
		}
		}
}
