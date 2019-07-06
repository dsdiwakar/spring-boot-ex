package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.ProductDao;
import com.abc.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public Product addProduct(Product product) {
		Product productObj = productDao.save(product);
		return productObj;
	}

	@Override
	public Product updateProduct(Product product) {
		Product product1 = productDao.save(product);
		return product1;
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> list = productDao.findAll();
		return list;
	}

	@Override
	public void deleteProduct(int productId) {
		Product product = new Product();
		product.setProductId(productId);
		productDao.delete(product);
	}
	
	@Override
	public Optional<Product> findById(int productId) {
		Optional<Product> product = productDao.findById(productId);
		return product;
	}

}
