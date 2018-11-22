package controller;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HolidayDAO;
import model.holiday;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/HolidayServlet")
public class HolidayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolidayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("ID"));
		String Destination =request.getParameter("Destination");
		String StartData =request.getParameter("StartData");
		String EndData =request.getParameter("EndData");
		int Cost = Integer.parseInt(request.getParameter("Cost"));
		int Quantity = Integer.parseInt(request.getParameter("Quantity"));
		holiday newholiday=new holiday(ID,Destination,StartData,EndData,Cost,Quantity);
		HolidayDAO.instance.addHoliday(newholiday);
		request.getRequestDispatcher("addHoliday.jsp").forward(request, response);
		
	}

}
