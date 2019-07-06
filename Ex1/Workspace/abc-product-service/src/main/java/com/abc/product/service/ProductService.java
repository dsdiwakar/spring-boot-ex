package com.abc.product.service;

import java.util.List;

import com.abc.product.entity.Product;

public interface ProductService {

	public void createProduct(Product product);

	public void updateProduct(Product product);

	public List<Product> findAllProducts();

	public Product findProductById(int productId);
	
	public void deleletProduct(int productId);

}
