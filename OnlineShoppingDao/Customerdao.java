package com.OnlineShoppingDao;


import com.entities.Customer;

public interface Customerdao {
	void insert(Customer customer);
Customer getCustomerByEmailAndPassword(String email, String password);
}
