package com.abc.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.product.entity.Product;
import com.abc.product.repository.ProductRepository;
import com.abc.product.service.ProductService;

@Service
public class ProdcutServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product findProductById(int productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public void deleletProduct(int productId) {

		Product product = new Product();
		product.setProductId(productId);
		productRepository.delete(product);
	}

}
