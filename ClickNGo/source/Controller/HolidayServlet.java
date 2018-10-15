package Controller;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HolidayDAO;
import model.holiday;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class HolidayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolidayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("checkin for ID in db");
		
		int ID = request.getContentLength();
		String Destination=request.getParameter("Destination");
		String StartData=request.getParameter("StartData");
		String EndData=request.getParameter("EndData");
		int Cost=request.getContentLength();
		int Quantity=request.getContentLength();
		//HolidayDAO.instance.checkFirstName(name);
		request.getRequestDispatcher("addHoliday.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
//		PrintWriter p=response.getWriter();
//		String name = request.getParameter("name");
//		p.println("<p>hello"+name+"</p>");
//		p.close();
		//String name = request.getParameter("name");
		//Name A_Name= new Name(name);
		//HolidayDAO.instance.saveFirstName(A_Name);
		//request.getRequestDispatcher("addHoliday.jsp").forward(request, response);
		
	}

}
