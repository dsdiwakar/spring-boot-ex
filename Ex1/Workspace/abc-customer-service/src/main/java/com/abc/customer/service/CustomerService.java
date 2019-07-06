package com.abc.customer.service;

import com.abc.customer.entity.Customer;

public interface CustomerService {

	public void createCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(int customerId);

	public Customer getCustomerById(int customerId);

}
