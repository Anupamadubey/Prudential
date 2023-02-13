package com.prudential.assignment.CarRental.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer Id;
	private CarType model;
	private Integer price;
	private Integer count;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Car [Id=" + Id + ", model=" + model + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
}
