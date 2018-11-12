package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public enum UserLoginDAO {
	
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
	
	public void UserLogin(String email, String pword)
	{
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("Select email, password from usertable where email = ? and password = ?");
			psmt.setString(1, email);
			psmt.setString(2, pword);
			System.out.println("Login...");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not Login");
		}
	}

}
