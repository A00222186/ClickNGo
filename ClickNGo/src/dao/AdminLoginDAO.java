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
	    
		
		public boolean AdminLogin(int staffid, String Password) {
			Connection connection = getConnection();
			boolean status = false;
			try {
				PreparedStatement psmt = connection.prepareStatement("Select staffid, pword from admintable where staffid = ? and pword = ?");
				psmt.setInt(1, staffid);
				psmt.setString(2, Password);
				System.out.println("Login...");
				System.out.println("password: ");
			   // password = input.next();

			    //users check = new users(email, password);

			    //if(staffid.equals(staffid) && Password.equals(Password)) 
			    //    System.out.println("You are logged in");	
				//System.out.println("Status before rs.next()" + status);
				ResultSet rs=psmt.executeQuery();  
				status=rs.next();
				//return status;
				//System.out.println("Status after rs.next()" + status);
			    }catch(SQLException e) {
				e.printStackTrace();
			}	
			return status;
		}
		
}	