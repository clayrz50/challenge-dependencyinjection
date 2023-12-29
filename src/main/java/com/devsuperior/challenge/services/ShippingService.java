package com.devsuperior.challenge.services;

import org.springframework.stereotype.Service;

import com.devsuperior.challenge.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double shippingFee=0.0;
		if(order.getBasic()<100.0) {
			shippingFee+=20.0;
		}else if(order.getBasic()>=100 && order.getBasic()<200) {
			shippingFee+=12.0;
		}
		return shippingFee;
	}
}
