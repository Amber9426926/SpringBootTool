package edu.swjtuhc.demo.model;

public class ChangeModel {
	public String uName;
	public String uPwd;
	public String NuPwd;
	@Override
	public String toString() {
		return "ChangeModel [uName=" + uName + ", uPwd=" + uPwd + ", NuPwd=" + NuPwd + "]";
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
		return NuPwd;
	}
	public void setNuPwd(String nuPwd) {
		NuPwd = nuPwd;
	}
}
