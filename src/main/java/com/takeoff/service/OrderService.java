package com.takeoff.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.takeoff.model.OrderDetails;

@Service
public class OrderService {

	@Transactional
	public Boolean payment(OrderDetails orderDetails)
	{
		
		System.out.println(orderDetails);
		
		return true;
		
		
		
		
		
	}


	
}
