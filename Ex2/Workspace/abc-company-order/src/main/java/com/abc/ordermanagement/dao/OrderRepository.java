package com.abc.ordermanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.ordermanagement.entity.Customer;
import com.abc.ordermanagement.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
	public List<Orders> findByCustomer(Customer customer);

}
