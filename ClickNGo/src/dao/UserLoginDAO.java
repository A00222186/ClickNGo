package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;

public enum UserLoginDAO {

		instance;
		public Connection getConnection(){
		Connection connection = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/clickngodb", "root", "admin");
					if(connection !=null) {
					System.out.println("Connected to ClickNGoDB OK!");	
					}
		}catch(Exception e) {
				System.out.println("Couldnt connect");
				e.printStackTrace();
			}
			return connection;
		}
	    
		
		public boolean UserLogin(String email, String Password) {
			Connection connection = getConnection();
			boolean status = false;
			try {
				PreparedStatement psmt = connection.prepareStatement("Select Email, pwd from usertable where Email = ? and pwd = ?");
				psmt.setString(1, email);
				psmt.setString(2, Password);
				System.out.println("Login...");
				System.out.println("password: ");
			   
				ResultSet rs=psmt.executeQuery();  
				status=rs.next();
				
			    }catch(SQLException e) {
				e.printStackTrace();
			}	
			return status;
		}
		
}	