package com.abc.order.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.order.entity.Orders;
import com.abc.order.repository.OrderRepository;
import com.abc.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void createOrder(Orders order) {
		orderRepository.save(order);

	}

	@Override
	public void updateOrder(Orders order) {
		orderRepository.save(order);

	}

	@Override
	public Orders findOrderById(int orderId) {
		

		Optional<Orders> order = orderRepository.findById(Integer.valueOf(orderId));

		/*List<OrderDetail> orderDetailList = order.get().getOrderDetailList();

		for (OrderDetail orderDetail : orderDetailList) {
			totalPrice = totalPrice + orderDetail.getProduct().getUnitPrice();
			totalProduct = totalProduct + orderDetail.getQuantity();
		}

		Order updatedOrder = order.get();
		updatedOrder.setTotalPrice(totalPrice);
		updatedOrder.setTotalProduct(totalProduct);
		updatedOrder.setOrderDate(createdDate);*/

		return order.get();
	}

	@Override
	public List<Orders> findAllOrders() {

		List<Orders> orderList = orderRepository.findAll();
		return orderList;
	}

}
