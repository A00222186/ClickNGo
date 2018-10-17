package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Info;

public enum userReDao {

	instance;
	public Connection getConnection(){
	Connection connection = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/clickngo", "root", "admin");
				if(connection !=null) {
				System.out.println("Connected to UserTable OK!");	
				}
	}catch(Exception e) {
		System.out.println("Connected to UserTable fff!");
			e.printStackTrace();
		}
		return connection;
	}
    
	
	public void savenewUser(Info newUser) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  usertable(FirstName,LastName,Email,PhoneNo,Address,pwd) VALUES(?,?,?,?,?,?)");
			psmt.setString(1,newUser.getFirstName());
			psmt.setString(2,newUser.getLastName());
			psmt.setString(3,newUser.getEmail());
			psmt.setString(4,newUser.getPhoneNo());
			psmt.setString(5,newUser.getAddress());
			psmt.setString(6,newUser.getPassword());
			psmt.executeUpdate();
			System.out.println("Added" + newUser.getFirstName()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}	
	
}

