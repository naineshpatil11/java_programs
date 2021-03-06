package com.bridgelabz.pojo;

public class Student 
{
	 private String username;
	 private String fName;
	 private String lName;
	 private String password;
	 private String cPassword;
	 private String email;
	 private String phoneNo;
	 private String dob;
	 
	 public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [ UserName:"+username+",Firstname"+fName+",Lastname"
	+lName+",Password"+password+",Cpassword"+cPassword+",Email"+email
	+",PhoneNo"+phoneNo+",DOB"+dob+"]";
				
	}
	
}
