package com.kyle.pcpartpicker.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("/products/{type}")
	public List<Product> getProducts(@PathVariable ProductType type) {
		return productService.getProducts(type);
	}

	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/products/{type}/{id}")
	public Product getProduct(@PathVariable ProductType type, @PathVariable String id) {
		return productService.getProduct(type, id);
	}
}
