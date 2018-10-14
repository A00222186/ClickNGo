package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServletFactory
 */
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String FirstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		String Email = request.getParameter("email");
		String PhoneNo = request.getParameter("phoneno");
		String Address = request.getParameter("address");
		String Password= request.getParameter("password");
		//System.out.println("the first Name is " + firstName);
		if(FirstName.length() == 0 || FirstName == null || LastName.length() == 0 || LastName == null||Email==null||PhoneNo==null||Password==null||Password.length()<6) {
			request.setAttribute("malformedName", "UserName,Email,PhoneNo,Password must not be null and password at least 6 digits");
			RequestDispatcher malformedName = getServletContext().getRequestDispatcher("/useraccount.jsp");
			malformedName.forward(request, response);
		}
	}

}