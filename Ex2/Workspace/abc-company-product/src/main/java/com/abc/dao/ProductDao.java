package com.abc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>
{

}
