package employee;

import java.sql.Date;

public class Employee {
	int ID;
	String name;
	String phoneNum;
	Date entry;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getEntry() {
		return entry;
	}
	public void setEntry(Date entry) {
		this.entry = entry;
	}
	

}
