package com.abc.order.service;

import java.util.List;

import com.abc.order.entity.Orders;

public interface OrderService {
	
	public void createOrder(Orders order);
	
	public void updateOrder(Orders order);
	
	public Orders findOrderById(int orderId);
	
	public List<Orders> findAllOrders();
	

}
