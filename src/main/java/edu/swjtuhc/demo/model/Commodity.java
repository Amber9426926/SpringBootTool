package edu.swjtuhc.demo.model;

import java.util.Date;

public class Commodity {
	private int ID;
	private String Type;
	private String Name;
	private String Price;
	private int Num;
	private Date Add_time;
	private String Photo;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public Date getAdd_time() {
		return Add_time;
	}
	public void setAdd_time(Date add_time) {
		Add_time = add_time;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	@Override
	public String toString() {
		return "Commodity [ID=" + ID + ", Type=" + Type + ", Name=" + Name + ", Price=" + Price + ", Num=" + Num
				+ ", Add_time=" + Add_time + ", Photo=" + Photo + "]";
	}
	
}
