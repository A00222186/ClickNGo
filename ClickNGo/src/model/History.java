package model;



public class History {
	
     private int PurchasedHoliday;   
     private int HolidayID;
    private String Destination;
    private String StartDate;
    private String UserID;
    
     
    
	public int getPurchasedHoliday() {
		return PurchasedHoliday;
	}



	public void setPurchasedHoliday(int purchasedHoliday) {
		PurchasedHoliday = purchasedHoliday;
	}



	public int getHolidayID() {
		return HolidayID;
	}



	public void setHolidayID(int holidayID) {
		HolidayID = holidayID;
	}



	public String getDestination() {
		return Destination;
	}



	public void setDestination(String destination) {
		Destination = destination;
	}



	public String getStartDate() {
		return StartDate;
	}



	public void setStartDate(String startDate) {
		StartDate = startDate;
	}



	public String getUserID() {
		return UserID;
	}



	public void setUserID(String userID) {
		UserID = userID;
	}



	public History(int ph, int hid, String dest, String startdate, String uid) {
		super();
		this.PurchasedHoliday=ph;
		this.HolidayID=hid;
		this.Destination=dest;
		this.StartDate=startdate;
		this.UserID=uid;
		
		
	}



	
     
 }