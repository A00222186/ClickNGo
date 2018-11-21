 package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.History;
public class HistoryDAO {
	 public List<History> readFirstTitle(){
		         List<History> list =new ArrayList<History>();
		         Connection con=null;
		          PreparedStatement psmt=null;
		          ResultSet rs=null;
		          try {
		              Class.forName("com.mysql.jdbc.Driver");
		          } catch (ClassNotFoundException e) {
		              e.printStackTrace();
		          }
		          
		         try {
		              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clickngodb","root","admin");
		              String sql="select * from historytable order by UserID";
		              psmt=con.prepareStatement(sql);
		              rs=psmt.executeQuery();
		             
		              while(rs.next())
		             {
		                  int ph=rs.getInt("PurchasedHolidayID");
		                  int hid=rs.getInt("HolidayID");
		                  String dest=rs.getString("Destination");
		                  String startdate=rs.getString("StartDate");
		                  String uid = rs.getString("UserID");
		                  
		                  History tl=new History(ph, hid, dest, startdate, uid);
		                  list.add(tl);
		              }
		              
		          } catch (SQLException e) {
		              e.printStackTrace();
		         }finally
		          {
		              try {
		                  if(rs!=null)
		                  {
		                      rs.close();
		                  }
		                  if(psmt!=null)
		                  {
		                      psmt.close();
		                  }
		                  if(con!=null)
		                  {
		                      con.close();
		                 }
		             } catch (SQLException e) {
		                  e.printStackTrace();
		              }
		          }
		          return list;
		      }
		      
		  }