package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;
	private Double cost;
	private String description;
	private String category;
	private String type;

public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public Product(){
		
	}

	public Product(String name, Double cost, String description,
			String category, String type) {
		super();
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.category = category;
		this.type = type;
	}


	
	
}





