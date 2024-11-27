package com.spring.Sp_project.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // which generates to string and equals and hashcode in our code 
@AllArgsConstructor //  which generates argument auto for each value in this which generates constructor 
@NoArgsConstructor
public class Product {
	
	// lombok is not working properly so getter and setter is good way.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto generation 
	private long id;
	private String name;
	private long price ;
	private Date out_date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Date getOut_date() {
		return out_date;
	}
	public void setOut_date(Date out_date) {
		this.out_date = out_date;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", out_date=" + out_date + "]";
	}
	
	
}
