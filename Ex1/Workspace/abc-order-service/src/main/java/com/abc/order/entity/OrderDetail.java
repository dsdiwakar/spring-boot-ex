package com.abc.order.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "order_detail")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class OrderDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2688799796797125638L;

	@Id
	private int orderDetailId;

	private int quantity;

	@JsonBackReference(value = "order-orderdetails")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Orders order;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public OrderDetail() {
	}

	public OrderDetail(int orderDetailId, int quantity, Orders order, Product product) {
		super();
		this.orderDetailId = orderDetailId;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
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

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
