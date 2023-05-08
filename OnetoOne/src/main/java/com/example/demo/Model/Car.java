package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	private String name;
	@JoinColumn(name="CarDesign_no")
	@OneToOne
	
	private CarDesign CarDesign;
	
	public CarDesign getCarDesign() {
		return CarDesign;
	}
	public void setCarDesign(CarDesign carDesign) {
		CarDesign = carDesign;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", CarDesign=" + CarDesign + "]";
	}
	

}
