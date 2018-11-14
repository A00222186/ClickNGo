package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Title;
public class TitleDAO {
	 public List<Title> readFirstTitle(){
		         List<Title> list =new ArrayList<Title>();
		         Connection con=null;
		          PreparedStatement psmt=null;
		          ResultSet rs=null;
		          try {
		              Class.forName("com.mysql.jdbc.Driver");
		          } catch (ClassNotFoundException e) {
		              e.printStackTrace();
		          }
		          
		         try {
		              con=DriverManager.getConnection("jdbc:mysql://localhost:3307/clickngodb","root","admin");
		              String sql="select * from holidaytable";
		              psmt=con.prepareStatement(sql);
		              rs=psmt.executeQuery();
		             
		              while(rs.next())
		             {
		                  int id=rs.getInt("ID");
		                  String des=rs.getString("Destination");
		                  String startdate=rs.getString("StartData");
		                  String enddate=rs.getString("EndData");
		                  int cost = rs.getInt("Cost");
		                  int quan = rs.getInt("Quantity");
		                  Title tl=new Title(id, des, startdate, enddate, cost, quan);
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