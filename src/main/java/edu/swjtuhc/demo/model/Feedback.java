package edu.swjtuhc.demo.model;

public class Feedback {
	private int f_id;
	private String uName;
	private String information;
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "Feedback [f_id=" + f_id + ", uName=" + uName + ", information=" + information + "]";
	}
}
