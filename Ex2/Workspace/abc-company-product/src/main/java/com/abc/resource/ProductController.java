package com.abc.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Product;
import com.abc.service.ProductService;

//RestResource is called controller

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/create") //done
	public String createProduct(@RequestBody Product product) {
		String status = "";
		if (product != null) {
			productService.addProduct(product);
			status = "succesfully saved";
		} else {
			status = "Failure";
		}
		return status;
	}

	@GetMapping("/getall") //done
	public List<Product> listOfProducts() {
		System.out.println(this.getClass().getSimpleName() + "---Getall Invoked");
		List<Product> products = productService.getAllProducts();
		return products;
	}

	@GetMapping(value = "/findbyid/{productId}") //done
	public Optional<Product> getProductById(@PathVariable int productId) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Get Product details by id is invoked.");
		Optional<Product> product = productService.findById(productId);
		return product;
	}

	@PutMapping("/update/{productId}") //done
	public void updateProduct(@RequestBody Product product, @PathVariable int productId) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Update is invoked.");
		productService.addProduct(product);
	}

	@DeleteMapping("/delete/{productId}") //done
	public void delProduct(@PathVariable int productId) {
		System.out.println(this.getClass().getSimpleName() + " - Delete is invoked.");
		productService.deleteProduct(productId);
	}
}