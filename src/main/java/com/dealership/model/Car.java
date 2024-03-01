package com.dealership.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="car")
@Entity
public class Car {
	
	@Id
	private int id;
	@Column(name="type")
	private Type type;
	
	@Column(name="brand")
	private String brand;
	@Column(name="model")
	private String model;
	
	@Column(name="price")
	private int price;
	
	@Column(name="location")
	private String location;
	
	@Column(name="image")
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", type=" + type + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", location=" + location + ", image=" + image + "]";
	}

	public Car(int id, Type type, String brand, String model, int price, String location, String image) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.location = location;
		this.image = image;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
	
