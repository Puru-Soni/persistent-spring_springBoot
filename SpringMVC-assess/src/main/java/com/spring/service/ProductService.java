package com.spring.service;

import java.util.ArrayList;

import com.spring.entity.Product;

public interface ProductService {


ArrayList<Product> getProductList();
ArrayList<Product> findByCategoryAndType(String category, String type);
}
