package member;

import java.sql.Date;

public class Member {
	int member_ID;
	String name;
	Date birth;
	int point;
	public int getMember_ID() {
		return member_ID;
	}
	public void setMember_ID(int member_ID) {
		this.member_ID = member_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
