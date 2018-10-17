package model;

public class holiday{
	
	private int ID;
	private String Destination;
	private String StartData;
	private String EndData;
	private int Cost;
	private int Quantity;
	
	public holiday(int id, String d, String sd, String ed, int c, int q) 
	{
		this.ID=id;
		this.Destination=d;
		this.StartData=sd;
		this.EndData=ed;
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
	public String getStartData() {
		return StartData;
	}
	public void setStartData(String startData) {
		this.StartData = startData;
	}
	public String getEndData() {
		return EndData;
	}
	public void setEndData(String endData) {
		this.EndData = endData;
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
