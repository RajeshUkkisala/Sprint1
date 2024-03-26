package com.OnlineShoppingDao;

import java.util.List;

import com.entities.Payment;

public interface Paymentdao {
	Payment getPaymentById(int paymentId);
	void addPayment(Payment payment);
	void updatePayment(Payment payment);
	void deletePayment(int paymentId);
	static List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}
}
