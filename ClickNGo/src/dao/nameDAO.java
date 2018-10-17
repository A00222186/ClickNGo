package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.*;

public enum nameDAO {

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
	    
		
		public void regAdmin(admin newAdmin) {
			Connection connection = getConnection();
			try {
				PreparedStatement psmt = connection.prepareStatement("INSERT INTO admintable (staffid, firstName, lastName, address, email, pword, phone) VALUES(?,?,?,?,?,?,?)");
				psmt.setInt(1,newAdmin.getStaffid());
				psmt.setString(2,newAdmin.getFirstName());
				psmt.setString(3,newAdmin.getLastName());
				psmt.setString(4,newAdmin.getAddress());
				psmt.setString(5,newAdmin.getEmail());
				psmt.setString(6,newAdmin.getPhone());
				psmt.setString(7,newAdmin.getPassword());
				psmt.executeUpdate();
				System.out.println("Added " + newAdmin.getFirstName()+" to the database.");
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		
		/*public admin checkFirstName(String name) {
			Connection connection = getConnection();
			admin A_Name=null;
			try {
				PreparedStatement psmt = connection.prepareStatement("SELECT * FROM AdminTable WHERE firstName = ?");
				psmt.setString(1,name);
				ResultSet rs = psmt.executeQuery();
				if(rs.next()) {
					A_Name=new admin(rs.getString("firstname"));
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
