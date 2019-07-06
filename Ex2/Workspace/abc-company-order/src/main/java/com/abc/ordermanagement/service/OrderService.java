package com.abc.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import com.abc.ordermanagement.entity.Orders;

public interface OrderService {
	public void createOrder(Orders order);

	public List<Orders> getAllOrders();

	public void deleteOrder(int orderId);

	public Orders updateOrder(Orders order);

	public Optional<Orders> findById(int orderId);

	public List<Orders> findOrdersByCustomerId(int customerId);
}
