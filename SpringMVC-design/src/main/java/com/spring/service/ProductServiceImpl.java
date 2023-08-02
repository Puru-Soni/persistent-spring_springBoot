package com.spring.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDAO;
import com.spring.entity.Product;

//Fill your code here
@Service
public class ProductServiceImpl implements ProductService{


    //Fill your code here
	@Autowired
	ProductDAO dao;
	
	public ArrayList<Product> returnList() {
		
	//Fill your code here
		return dao.returnList();
	}
	
}
