package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.userReDao;
import model.Info;

/**
 * Servlet implementation class RegisterServletFactory
 */
@WebServlet("/RegisterServletFactory")
public class RegisterServletFactory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServletFactory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSession session = request.getSession();
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		String PhoneNo = request.getParameter("PhoneNo");
		String Address = request.getParameter("Address");
		String Password= request.getParameter("Password");
		//System.out.println("the first Name is " + firstName);
		if(FirstName.length() == 0 || FirstName == null || LastName.length() == 0 || LastName == null||Email==null||PhoneNo == null||Password==null||Password.length()<6) {
			request.setAttribute("malformedName", "UserName,Email,PhoneNo,Password must not be null and password at least 6 digits");
			RequestDispatcher malformedName = getServletContext().getRequestDispatcher("/useraccount.jsp");
			malformedName.forward(request, response);
		}
		else
		{
			Info newUser = new Info(FirstName,LastName,Email,PhoneNo,Address,Password);
			userReDao.instance.savenewUser(newUser);
			request.getRequestDispatcher("useraccount.jsp").forward(request, response);
		}
		
	}

}

