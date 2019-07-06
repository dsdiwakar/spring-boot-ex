package com.abc.ordermanagement.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ordermanagement.entity.Customer;
import com.abc.ordermanagement.entity.Orders;
import com.abc.ordermanagement.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource 
{
	@Autowired
	private CustomerService customerService;
	@GetMapping("/getall")
	public List<Customer> getAllCustomer()
	{
		List<Customer> list =	customerService.listOfCustomers();
		return list;
	}
	
	@PostMapping("/save")
	public void saveCustomer(Customer customer)
	{
		customerService.saveCustomer(customer);
	}
	
	@GetMapping("/findOrderByCustomerId/{customerId}")
	public List<Orders> getOrderByCustomerId(@PathVariable int customerId)
	{
		List<Orders> listOrders = customerService.getOrdersByCustomerId(customerId);
		return listOrders;
	}
}