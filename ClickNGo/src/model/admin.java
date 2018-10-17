package model;

public class admin {
	private int staffid;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String password;
	private String phone;
	
	public admin(int sid, String fn, String ln, String ad, String em, String ph, String pw)
	{
		this.staffid = sid;
		this.firstName = fn;
		this.lastName = ln;
		this.address = ad;
		this.email = em;
		this.phone = ph;
		this.password = pw;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
