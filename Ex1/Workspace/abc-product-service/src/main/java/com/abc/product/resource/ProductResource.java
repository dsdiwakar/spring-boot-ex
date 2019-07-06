package com.abc.product.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.product.entity.Product;
import com.abc.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/create")
	public String createProduct(@RequestBody Product product) {

		String status = "";

		if (product != null) {
			productService.createProduct(product);
			status = product.getName() + "is sucessfully inserted into database";
		} else {
			status = "Invalid Product information, so we are not inserting into database";
		}
		return status;
	}

	@PutMapping(value = "/update")
	public String updateProduct(@RequestBody Product product) {

		String status = "";
		if (product != null) {
			productService.updateProduct(product);
			status = product.getName() + "is sucessfully updated into database";
		} else {
			status = "Invalid Product information, so we are not updating into database";
		}
		return status;
	}

	@GetMapping(value ="/findAll")
	public List<Product> findAllProducts() {

		List<Product> productList = productService.findAllProducts();

		if (productList != null && productList.size() > 0) {
			return productList;
		} else {
			return null;
		}

	}
	
	@GetMapping(value="findById/reqparam")
	public Product findProductById1(@RequestParam int productId) {
		return productService.findProductById(productId);
	}
	
	@GetMapping(value="findById/path/{productId}")
	public Product findProductById(@PathVariable int productId) {
		return productService.findProductById(productId);		
	}

	@DeleteMapping(value="/delete/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		
		productService.deleletProduct(productId);
	}
	
		
}
