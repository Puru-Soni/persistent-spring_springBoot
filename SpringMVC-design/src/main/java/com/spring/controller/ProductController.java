package com.spring.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.ui.Model;

import com.spring.dao.ProductDAO;
import com.spring.dao.ProductDAOImpl;
import com.spring.entity.Product;
import com.spring.service.ProductService;

//Fill your code here
@Controller
public class ProductController {
    
    //Fill your code here
	@Autowired
    ProductService service;
	
	@RequestMapping("/")
    public ModelAndView index(ModelMap model){
		//Fill your code here
		model.addAttribute("productList", service.returnList());
    	ModelAndView m = new ModelAndView();
		m.setViewName("home");
		return m;

	}

}