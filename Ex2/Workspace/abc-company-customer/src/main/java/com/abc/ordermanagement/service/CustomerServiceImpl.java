package com.abc.ordermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ordermanagement.client.OrderServiceClient;
import com.abc.ordermanagement.entity.Customer;
import com.abc.ordermanagement.entity.Orders;
import com.abc.ordermanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderServiceClient orderServiceClient;

	@Override
	public List<Customer> listOfCustomers() {
		List<Customer> customerList = customerRepository.findAll();
		return customerList;
	}

	@Override
	public void saveCustomer(Customer customer) 
	{
		customerRepository.saveAndFlush(customer);
	}

	@Override
	public List<Orders> getOrdersByCustomerId(int customerId) {
		List<Orders> orderList = orderServiceClient.getOrdersByCustomerId(customerId);
		return orderList;
	}
}
