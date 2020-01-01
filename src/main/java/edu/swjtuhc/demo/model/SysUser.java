package edu.swjtuhc.demo.model;

import java.util.Date;

public class SysUser {
	private int uID;
	private String uName;
	private String uPwd;
	private String nuPwd;
	private String uSex;
	private String uPhone;
	private Date uRegTime;
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getNuPwd() {
		return nuPwd;
	}
	public void setNuPwd(String nuPwd) {
		this.nuPwd = nuPwd;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public Date getuRegTime() {
		return uRegTime;
	}
	public void setuRegTime(Date uRegTime) {
		this.uRegTime = uRegTime;
	}
	@Override
	public String toString() {
		return "SysUser [uID=" + uID + ", uName=" + uName + ", uPwd=" + uPwd + ", nuPwd=" + nuPwd + ", uSex=" + uSex
				+ ", uPhone=" + uPhone + ", uRegTime=" + uRegTime + "]";
	}
	
}
