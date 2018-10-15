package DAO;
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
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ClickNGo", "root", "admin");
				if(connection !=null) {
				System.out.println("Connected to demoDB OK!");	
				}
	}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void saveID(holiday id) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (ID) VALUES(?)");
			psmt.setInt(1,id.getID());
			psmt.executeUpdate();
			System.out.println("Added" + id.getID()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveDestination(holiday d) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (Destination) VALUES(?)");
			psmt.setString(1,d.getDestination());
			psmt.executeUpdate();
			System.out.println("Added" + d.getDestination()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveStartData(holiday sd) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (StartData) VALUES(?)");
			psmt.setString(1,sd.getStartData());
			psmt.executeUpdate();
			System.out.println("Added" + sd.getStartData()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveEndData(holiday ed) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (EndData) VALUES(?)");
			psmt.setString(1,ed.getEndData());
			psmt.executeUpdate();
			System.out.println("Added" + ed.getEndData()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveCost(holiday c) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (Cost) VALUES(?)");
			psmt.setInt(1,c.getCost());
			psmt.executeUpdate();
			System.out.println("Added" + c.getCost()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void saveQuantity(holiday q) {
		Connection connection = getConnection();
		try {
			PreparedStatement psmt = connection.prepareStatement("INSERT INTO holiday Available (Quantity) VALUES(?)");
			psmt.setInt(1,q.getQuantity());
			psmt.executeUpdate();
			System.out.println("Added" + q.getQuantity()+"to the database.");
		}catch(SQLException e) {
			e.printStackTrace();
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

