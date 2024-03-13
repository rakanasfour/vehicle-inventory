package com.vinventory.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	private int id;
	
	@Column(name="image")
	private String image;
	
	@Column(name="type")
	private Type type;
	@Column(name="make")
	private String make;
	@Column(name="model")
	private String model;
	@Column(name="year")
	private int year;
	@Column(name="price")
	private int price;
	
	public Vehicle(int id, String image, Type type, String make, String model, int year, int price) {
		super();
		this.id = id;
		this.image = image;
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", image=" + image + ", type=" + type + ", make=" + make + ", model=" + model
				+ ", year=" + year + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
