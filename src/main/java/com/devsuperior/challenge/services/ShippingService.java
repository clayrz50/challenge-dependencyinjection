package com.devsuperior.challenge.services;

import com.devsuperior.challenge.entities.Order;

public class ShippingService {
	public double shipment(Order order) {
		double shippingFee=0;
		if(order.getBasic()<100) {
			shippingFee=20.0;
		}else if(order.getBasic()<=100 && order.getBasic()<200) {
			shippingFee=12.0;
		}else {
			shippingFee=0.0;
		}
		return shippingFee;
	}
}
