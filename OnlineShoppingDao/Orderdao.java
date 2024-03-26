package com.OnlineShoppingDao;

import java.util.List;

import com.entities.Order;

public interface Orderdao {
	Order getOrderById(int orderId);
	void addOrder(Order orderobj);
	void updateOrder(Order order);
	void deleteOrder(int orderId);
	static List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
}
