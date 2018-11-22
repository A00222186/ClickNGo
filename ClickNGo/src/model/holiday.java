package model;

public class holiday{
	
	private int ID;
	private String Destination;
	private String StartDate;
	private String EndDate;
	private int Cost;
	private int Quantity;
	
	public holiday(int id, String d, String sd, String ed, int c, int q) 
	{
		this.ID=id;
		this.Destination=d;
		this.StartDate=sd;
		this.EndDate=ed;
		this.Cost=c;
		this.Quantity=q;
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		this.Destination = destination;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		this.StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		this.EndDate = endDate;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		this.Cost = cost;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int qunatity) {
		this.Quantity = qunatity;
	}

}
