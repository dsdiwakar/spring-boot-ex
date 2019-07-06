package com.abc.ordermanagement.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ordermanagement.entity.Orders;
import com.abc.ordermanagement.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/create")
	public void saveOrder(@RequestBody Orders order) {
		orderService.createOrder(order);
	}

	@GetMapping("/getall")
	public List<Orders> getAllOrders() {
		List<Orders> list = orderService.getAllOrders();
		return list;
	}

	@PutMapping("/update/{id}")
	public void updateOrder(@RequestBody Orders order, @PathVariable int id) {
		orderService.updateOrder(order);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteOrder(@PathVariable int id) {
		orderService.deleteOrder(id);
	}

	@GetMapping("/findbyid/{id}")
	public Optional<Orders> findById(@PathVariable int id) {
		Optional<Orders> order = orderService.findById(id);
		return order;
	}

	@GetMapping("/findOrderByCustomer/{customerId}")
	public List<Orders> getOrdersByCustomerId(@PathVariable int customerId) {
		List<Orders> orderList = orderService.findOrdersByCustomerId(customerId);
		return orderList;
	}

}