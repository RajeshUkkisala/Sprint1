package com.OnlineShoppingDao;

import java.util.List;

import com.entities.Products;


public interface Productdao {
	void insert(Products product);
	void update(int productid,String productname);
    void deleteProduct(int productId);
    static List<Products> select() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	void search(int productid);
}
