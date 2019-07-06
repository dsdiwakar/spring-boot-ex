package com.abc.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.order.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
