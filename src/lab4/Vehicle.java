package lab4;

import java.util.Date;

public abstract class Vehicle {
	
	private String color;
	private Date dateMade;
	
	public Vehicle() {
		this("Red");
	}
	
	public Vehicle(String color) {
		this.color = color;
		dateMade = new java.util.Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateMade() {
		return dateMade;
	}

	public void setDateMade(Date date) {
		this.dateMade = date;
	}
	
	public abstract void steer();
}
