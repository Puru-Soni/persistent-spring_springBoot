   package com.spring.dao;

import java.util.ArrayList;

import com.spring.entity.Product;

public interface ProductDAO {


ArrayList<Product> getProductList();
ArrayList<Product> findByCategoryAndType(String category, String type);
}
