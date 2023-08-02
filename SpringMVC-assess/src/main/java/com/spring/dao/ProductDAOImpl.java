package com.spring.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

//Fill your code here
@Repository
public class ProductDAOImpl implements ProductDAO{
    
    //Fill your code here
    ArrayList<Product> p;
	
	//Fill your code here
	public ArrayList<Product>getProductList() {
		//Fill your code here
		p = new ArrayList<Product>();
		p.add(new Product("Washing Machine",	20000.00,	"Bosch 6.5Kg Washing Machines",	"Laundry Room",	"Laundry Room - Appliances"));
		p.add(new Product("Laptop",	14000.00,	"Lenovo Ideapad Core i3",	"Conference Room",	"Conference Room - Electronics"));
		p.add(new Product("Laptop",	32000.00,	"Hewlett Packard Laptops",	"Conference Room",	"Conference Room - Electronics"));
		p.add(new Product("Chair",	540.00,	"Recliner",	"Living Room",	"Living Room - Furniture"));
		p.add(new Product("Sofa",	1500.00,	"Soft Sofa",	"Living Room",	"Living Room - Furniture"));
		return p;
	}
	public ArrayList<Product> findByCategoryAndType(String category,String type ) {
		//Fill your code here
		ArrayList<Product> p = this.getProductList();
		ArrayList<Product> res = new ArrayList<Product>();
		for(Product item : p) {
			if(item.getCategory().equals(category) && item.getType().equals(type)) {
				res.add(item);
			}
		}
		return res;
	}
	
}
