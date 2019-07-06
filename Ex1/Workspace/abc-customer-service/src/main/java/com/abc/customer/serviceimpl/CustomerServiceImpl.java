package com.abc.customer.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.customer.entity.Customer;
import com.abc.customer.repository.CustomerRepository;
import com.abc.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createCustomer(Customer customer) {
		customerRepository.saveAndFlush(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.saveAndFlush(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customerRepository.delete(customer);

	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}

}
