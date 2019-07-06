package com.abc.order.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563913265208182606L;

	@Id
	private int orderId;

	private double totalPrice;
	private int totalProduct;
	private Date orderDate;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@JsonManagedReference(value = "order-orderdetails")
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderDetail> orderDetailList;

	public Orders() {
	}

	public Orders(int orderId, double totalPrice, int totalProduct, Date orderDate, Customer customer,
			List<OrderDetail> orderDetailList) {
		super();
		this.orderId = orderId;
		this.totalPrice = totalPrice;
		this.totalProduct = totalProduct;
		this.orderDate = orderDate;
		this.customer = customer;
		this.orderDetailList = orderDetailList;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalProduct() {
		return totalProduct;
	}

	public void setTotalProduct(int totalProduct) {
		this.totalProduct = totalProduct;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

}
