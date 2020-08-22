package com.hbfw.pojo;

import java.util.Date;

public class User {
	private int uid;
	private String uname;
	private Date ubirthday;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	
}
