package com.abc.ordermanagement.service;

import java.util.List;


import com.abc.ordermanagement.entity.Customer;
import com.abc.ordermanagement.entity.Orders;

public interface CustomerService 
{
	public List<Customer> listOfCustomers();
	
	public void saveCustomer(Customer customer);
	
	public List<Orders> getOrdersByCustomerId(int customerId);
}
