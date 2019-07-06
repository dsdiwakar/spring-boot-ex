package com.abc.customer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.customer.entity.Customer;
import com.abc.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public void createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
	}

	@PutMapping("/update")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/delete")
	public void deleteCustomer(@PathVariable int customerId) {
		customerService.deleteCustomer(customerId);
	}

	@GetMapping("/get/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		return customer;
	}

}
