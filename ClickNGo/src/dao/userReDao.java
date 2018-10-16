package dao;

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
public class userReDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userReDao() {
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
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String Email = request.getParameter("Email");
		int PhoneNo = request.getContentLength();
		String Address = request.getParameter("Address");
		String Password= request.getParameter("Password");
		//System.out.println("the first Name is " + firstName);
		if(FirstName.length() == 0 || FirstName == null || LastName.length() == 0 || LastName == null||Email==null||PhoneNo == 0||Password==null||Password.length()<6) {
			request.setAttribute("malformedName", "UserName,Email,PhoneNo,Password must not be null and password at least 6 digits");
			RequestDispatcher malformedName = getServletContext().getRequestDispatcher("/index.jsp");
			malformedName.forward(request, response);
		}
		
	}

}

