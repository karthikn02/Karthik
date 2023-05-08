package com.example.demo.Service;


public class CarSer {
	
	
	private String carmodel;
	private String color;
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarSer(String carmodel, String color) {
		super();
		this.carmodel = carmodel;
		this.color = color;
	}
	@Override
	public String toString() {
		return "CarRequest [carmodel=" + carmodel + ", color=" + color + "]";
	}
	public Object getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
