package com.abc.ordermanagement.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.ordermanagement.entity.Orders;


@FeignClient(name = "abc-order-service")
public interface OrderServiceClient {
	
	@GetMapping("/order/findOrderByCustomer/{customerId}")
	public List<Orders> getOrdersByCustomerId(@PathVariable int customerId);
}