package com.abc.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ordermanagement.dao.OrderRepository;
import com.abc.ordermanagement.entity.Customer;
import com.abc.ordermanagement.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderDao;

	@Override
	public void createOrder(Orders order) {
		orderDao.save(order);
	}

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> list = orderDao.findAll();
		return list;
	}

	@Override
	public void deleteOrder(int orderId) {
		Orders order = new Orders();
		order.setOrderId(orderId);
		orderDao.delete(order);
	}

	@Override
	public Orders updateOrder(Orders order) {
		Orders order1 = orderDao.save(order);
		return order1;
	}

	@Override
	public Optional<Orders> findById(int orderId) {
		Optional<Orders> order = orderDao.findById(orderId);
		return order;
	}

	@Override
	public List<Orders> findOrdersByCustomerId(int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		List<Orders> orderList = orderDao.findByCustomer(customer);
		return orderList;
	}

}