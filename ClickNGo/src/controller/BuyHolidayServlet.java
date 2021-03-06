package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HolidayDAO;
import dao.removeHolDAO;
import model.holiday;

/**
 * Servlet implementation class BuyHolidayServlet
 */
@WebServlet("/BuyHolidayServlet")
public class BuyHolidayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyHolidayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int RemHol = Integer.parseInt(request.getParameter("holidayID"));
		removeHolDAO.instance.remHoliday(RemHol);
		request.getRequestDispatcher("new.jsp").forward(request, response);
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("BuyHolidayServlet.doPostMethod");
		int ID = Integer.parseInt(request.getParameter("holidayID"));
		HolidayDAO.instance.addHolidayToBasket(ID);
		removeHolDAO.instance.remHoliday(ID);
		request.getRequestDispatcher("new.jsp").forward(request, response);
	}

}
