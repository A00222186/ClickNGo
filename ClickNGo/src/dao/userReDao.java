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
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserTable", "root", "");
				if(connection !=null) {
				System.out.println("Connected to UserTable OK!");	
				}
	}catch(Exception e) {
		System.out.println("Connected to UserTable fff!");
			e.printStackTrace();
		}
		return connection;
	}
    
	
	public void saveFirstName(Info FirstName) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(FirstName) VALUES(?)");
			psmt.setString(1,FirstName.getFirstName());
			psmt.executeUpdate();
			System.out.println("Added" + FirstName.getFirstName()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveLastName(Info LastName) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(LastName) VALUES(?)");
			psmt.setString(1,LastName.getLastName());
			psmt.executeUpdate();
			System.out.println("Added" + LastName.getFirstName()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveEmail(Info Email) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(Email) VALUES(?)");
			psmt.setString(1,Email.getEmail());
			psmt.executeUpdate();
			System.out.println("Added" + Email.getEmail()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void savePhoneNo(Info PhoneNo) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(PhoneNo) VALUES(?)");
			psmt.setInt(PhoneNo.getPhoneNo(), 1);
			psmt.executeUpdate();
			System.out.println("Added" + PhoneNo.getPhoneNo()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveAddress(Info Address) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(Address) VALUES(?)");
			psmt.setString(1,Address.getEmail());
			psmt.executeUpdate();
			System.out.println("Added" + Address.getAddress()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void savePassword(Info Password) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO  UserTable(Password) VALUES(?)");
			psmt.setString(1,Password.getEmail());
			psmt.executeUpdate();
			System.out.println("Added" + Password.getPassword()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

		
	
}

