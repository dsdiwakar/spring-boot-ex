package com.abc.order.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.order.entity.Orders;
import com.abc.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderResource {

	@Autowired
	private OrderService orderService;

	@PostMapping("/create")
	public void createOrder(@RequestBody Orders order) {
		orderService.createOrder(order);

	}

	@PutMapping("/update")
	public void updateOrder(@RequestBody Orders order) {
		orderService.updateOrder(order);
	}

	@GetMapping("/find/{orderId}")
	public Orders findOrderById(@PathVariable int orderId) {
		Orders order = orderService.findOrderById(orderId);
		return order;
	}

	@GetMapping("/findAll")
	public List<Orders> findAllOrders() {

		List<Orders> orderList = orderService.findAllOrders();
		return orderList;
	}
}
