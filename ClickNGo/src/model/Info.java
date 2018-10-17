package model;

public class Info {
	 private String FirstName;
	 private String LastName;
	 private String Email;
	 private String PhoneNo;
	 private String Address;
	 private String Password;
	 
	 
	 public Info(String FirstName,String LastName,String Email,String PhoneNo,String Address,String Password) 
	 {this.FirstName=FirstName;
	  this.LastName=LastName;
	  this.Email=Email;
	  this.PhoneNo=PhoneNo;
	  this.Address=Address;
	  this.Password=Password;}
	 
	 public String getFirstName()
	 { return FirstName;}
	 public String getLastName() {return LastName;}
	 public String getEmail() {return Email;}
	 public String getPhoneNo() {return PhoneNo;}
	 public String getAddress() {return Address;}
	 public String getPassword() {return Password;}
	 public void setFirstName(String FirstName)
	 {
		 this.FirstName=FirstName;
	 }
	 public void setLastName(String LastName)
	 
	 {
		 this.LastName=LastName;
	 }
	 public void setEmail(String Email)

{
	 this.Email=Email;
}
	 public void setPhoneNo(String PhoneNo)

{
	 this.PhoneNo=PhoneNo;
}
	 public void setAddress(String Address)

{
	 this.Address=Address;
}
	 public void setPassword(String Password)

{
	 this.Password=Password;
}
	}
