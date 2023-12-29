package com.devsuperior.challenge.services;

import com.devsuperior.challenge.entities.Order;

public class OrderService {
	private OrderService orderService;
	
	public double total(Order order) {
		return order.getDiscount()-(order.getBasic()*order.getDiscount()/100)-orderService.total(order);
	}
}
