package com.abc.ordermanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orderdetails")
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3394088207565830801L;
	@Id
	private int orderDetailId;
	private int quantity;
	
	@JsonBackReference(value="order-orderdetails")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private Orders orders;
	
	@OneToOne
	@JoinColumn(name="product_id")
	private Product product;

	public OrderDetails() {
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderDetails(int orderDetailId, int quantity, Orders orders, Product product) {
		super();
		this.orderDetailId = orderDetailId;
		this.quantity = quantity;
		this.orders = orders;
		this.product = product;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
