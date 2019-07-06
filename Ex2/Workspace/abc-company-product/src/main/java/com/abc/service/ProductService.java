package com.abc.service;

import java.util.List;
import java.util.Optional;

import com.abc.entity.Product;

public interface ProductService 
{
	public Product addProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public void deleteProduct(int productId);
	
	public Product updateProduct(Product product);
	
	public Optional<Product> findById(int productId);
}
