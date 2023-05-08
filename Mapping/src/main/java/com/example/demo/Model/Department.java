package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	private String carModel;
	private int year;
	private Long price;
	private String Enginetype;
    private String color;
    private String carCompany;
    private String feature;
    private String Import;
    private String Delivery;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getEnginetype() {
		return Enginetype;
	}
	public void setEnginetype(String enginetype) {
		Enginetype = enginetype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getImport() {
		return Import;
	}
	public void setImport(String import1) {
		Import = import1;
	}
	public String getDelivery() {
		return Delivery;
	}
	public void setDelivery(String delivery) {
		Delivery = delivery;
	}
	@Override
	public String toString() {
		return "CarDesign [no=" + no + ", carModel=" + carModel + ", year=" + year + ", price=" + price
				+ ", Enginetype=" + Enginetype + ", color=" + color + ", carCompany=" + carCompany + ", feature="
				+ feature + ", Import=" + Import + ", Delivery=" + Delivery + "]";
	}
	public void setName(Object department) {
		// TODO Auto-generated method stub
		
	}
	
	
}
