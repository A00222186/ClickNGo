package dao;

import model.*;
import java.sql.*;

public enum removeHolDAO {
	
	instance;
	public Connection getConnection(){
	Connection connection = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://Localhost:3307/clickngodb", "root", "admin");
				if(connection !=null) {
				System.out.println("Connected to ClickNGoDB OK!");	
				}
	}catch(Exception e) {
			System.out.println("Couldnt connect");
			e.printStackTrace();
		}
		return connection;
	}
	
	public void remHoliday(int IDtoRemove)
	{
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("Delete from holidaytable where ID = ?");
			psmt.setInt(1, IDtoRemove);
			psmt.executeUpdate();
			System.out.println(IDtoRemove + " Holiday removed from DB");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not remove ID from DB");
		}
	}

}
