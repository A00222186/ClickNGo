package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import model.holiday;

public enum HolidayDAO {

	instance;
	public Connection getConnection(){
	Connection connection = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/clickngodb", "root", "admin");
				if(connection !=null) {
				System.out.println("Connected to demoDB OK!");	
				}
	}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void addHoliday(holiday newholiday) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holidaytable (ID, Destination, StartDate, EndDate, Cost, Quantity) VALUES(?,?,?,?,?,?)");
			psmt.setInt(1,newholiday.getID());
			psmt.setString(2,newholiday.getDestination());
			psmt.setString(3,newholiday.getStartData());
			psmt.setString(4,newholiday.getEndData());
			psmt.setInt(5,newholiday.getCost());
			psmt.setInt(6,newholiday.getQuantity());
			psmt.executeUpdate();
			System.out.println("Added " + newholiday.getID()+" to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void addHolidayToBasket(int holID)
	{
		String userID = "User111";
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO HolidayHistory(PurchaseHolidayID, HolidayID, Destination, StartDate, UserID ) VALUES(?, (Select HolidayID, Destination, StartDate From HolidayTable Where HolidayID = "+holID+"), ?)");
			psmt.setInt(1, 100);
			psmt.setString(2, userID);
			
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

