package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;

public enum AdminLoginDAO {

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
	    
		
		public void AdminLogin(String staffid, String Password) {
			Connection connection = getConnection();
			try {
				PreparedStatement psmt = connection.prepareStatement("Select staffid, password from admintable where staffid = ? and password = ?");
				psmt.setString(1, staffid);
				psmt.setString(2, Password);
				System.out.println("Login...");
				System.out.println("password: ");
			   // password = input.next();

			    //users check = new users(email, password);

			    if(staffid.equals(staffid) && Password.equals(Password)) 
			        System.out.println("You are logged in");	
			    }catch(SQLException e) {
				e.printStackTrace();
			}	
		}
}	