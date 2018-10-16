package controller;

import java.io.IOException;
import model.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.nameDAO;

//@Path("/AdminRegServlet")
@WebServlet("/AdminRegServlet")
public class AdminRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("checking for name in db");
		int staffid = Integer.parseInt(request.getParameter("staffid"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		nameDAO.instance.checkFirstName(name);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int staffid = Integer.parseInt(request.getParameter("staffid"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		admin newAdmin= new admin(staffid, fname, lname, address, email, phone, password);
		nameDAO.instance.regAdmin(newAdmin);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
