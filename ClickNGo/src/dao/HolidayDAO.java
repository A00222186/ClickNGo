package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Title;
import model.holiday;

public enum HolidayDAO {

	instance;
	Connection con=null;
    PreparedStatement psmt1=null;
    ResultSet rs=null;
    String userEmail = null;
	public Connection getConnection(){
	Connection connection = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clickngodb", "root", "admin");
				if(connection !=null) {
				System.out.println("Connected to demoDB OK!");	
				}
	}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Could not connect to DB");
		}
		return connection;
	}
	
	public void addHoliday(holiday newholiday) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holidaytable (ID, Destination, StartDate, EndDate, Cost, Quantity) VALUES(?,?,?,?,?,?)");
			psmt.setInt(1,newholiday.getID());
			psmt.setString(2,newholiday.getDestination());
			psmt.setString(3,newholiday.getStartDate());
			psmt.setString(4,newholiday.getEndDate());
			psmt.setInt(5,newholiday.getCost());
			psmt.setInt(6,newholiday.getQuantity());
			psmt.executeUpdate();
			System.out.println("Added " + newholiday.getID()+" to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void getEmail (String em) {
		userEmail = em;
	}
	
	public void addHolidayToBasket(int holID)
	{
		System.out.println("HolidayDAO.addHoliday");
		String userID = userEmail;
		Connection connection = getConnection();
		try {
			int holidayid=0;
			String des = "";
			String startdate = "";
			
			String sql=("Select ID, Destination, StartDate From holidaytable Where ID = "+holID);
            psmt1 = connection.prepareStatement(sql);
            rs=psmt1.executeQuery();
           
            while(rs.next())
            {
                holidayid=rs.getInt("ID");
                des=rs.getString("Destination");
                startdate=rs.getString("StartDate");
            }
            
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO historytable(PurchasedHolidayID, HolidayID, Destination, StartDate, UserID ) VALUES (?,?,?,?,?)");
			psmt.setInt(1, 100);
			psmt.setInt(2, holidayid);
			psmt.setString(3, des);
			psmt.setString(4, startdate);
			psmt.setString(5, userID);
			psmt.executeUpdate();
			System.out.println("Added to history table.");
		}catch(SQLException e1)
		{
			e1.printStackTrace();
		}
	}
	
	
	/*public Name checkFirstName(String name) {
		Connection connection = getConnection();
		Name A_Name=null;
		try {
			PreparedStatement psmt = connection.prepareStatement("SELECT * FROM MYNAMES WHERE firstname = ?");
			psmt.setString(1,name);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				A_Name=new Name(rs.getString("firstname"));
				System.out.println("name" +name+ "is in the data base");
			}
			else
			{
				System.out.println("name" +name+ "is in the data base");
			}
			psmt.executeUpdate();
			System.out.println("name" +name+ "is not in the data base");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return A_Name;
		
	}*/
}

