package model;

import java.sql.Date;

public class Title {
	
     private int id;   
     private String des;
    private String startdate;
    private String enddate;
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
         this.id = id;
     }
     public String getDes() {
        return des;
    }
     public void setDes(String des) {
         this.des = des;
    }
     public String getStartdate() {
        return startdate;
    }
     public void setStartdate(String startdate) {
         this.startdate = startdate;
     }
     public String getEnddate() {
         return enddate;
     }
     public void setEnddate(String enddate) {
         this.enddate = enddate;
     }
     public Title(int id, String des, String startdate, String enddate) {
         super();
         this.id = id;
        this.des = des;
         this.startdate = startdate;
         this.enddate = enddate;
     }
     
 }