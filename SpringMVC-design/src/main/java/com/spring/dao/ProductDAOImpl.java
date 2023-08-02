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
	ArrayList<Product> products;
	//Fill your code here
	public ArrayList<Product> returnList() {
		//Fill your code here
		products = new ArrayList<Product>();
		
		products.add(new Product("Chair", "Zeus", "Furniture",	1500));
		products.add(new Product("Garden Path",	"Acl",	"Outdoor",	1800));
		products.add(new Product("Sofa",	"Alias",	"Office",	5000));
		products.add(new Product("Table",	"Kristalia",	"Office",	8600));
		products.add(new Product("Wall Covering",	"Elitis",	"Decor",	4700));
		
		return products;
	}

	
}
