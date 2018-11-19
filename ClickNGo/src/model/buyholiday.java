package model;
//PurchaseHolidayID, HolidayID, Destination, StartDate, UserID
public class buyholiday {
private int PurchaseHolidayID;
private int HolidayID;
private String Destination;
private String StartDate;
private String UserID;

public buyholiday(int purchaseHolidayID, int holidayID, String destination, String startDate, String userID) {
	super();
	PurchaseHolidayID = purchaseHolidayID;
	HolidayID = holidayID;
	Destination = destination;
	StartDate = startDate;
	UserID = userID;
}

public int getPurchaseHolidayID() {
	return PurchaseHolidayID;
}

public void setPurchaseHolidayID(int purchaseHolidayID) {
	PurchaseHolidayID = purchaseHolidayID;
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



}
