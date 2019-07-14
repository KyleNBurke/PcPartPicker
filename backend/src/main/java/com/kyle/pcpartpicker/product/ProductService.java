package com.kyle.pcpartpicker.product;

import com.kyle.pcpartpicker.product.cpu.CPU;
import com.kyle.pcpartpicker.product.cpu.CPURepository;
import com.kyle.pcpartpicker.product.graphicscard.GraphicsCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	CPURepository cpuRepo;
	@Autowired
	GraphicsCardRepository graphicsCardRepo;

	private MongoRepository getRepository(ProductType type) {
		MongoRepository repo = null;

		switch(type) {
			case cpu:
				repo = cpuRepo;
				break;
			case graphics_card:
				repo = graphicsCardRepo;
				break;
		}

		return repo;
	}

	public List<Product> getProducts(ProductType type) {
		return getRepository(type).findAll();
	}

	public Product getProduct(ProductType type, String id) {
		return (Product)getRepository(type).findById(id).get();
	}

	public Product addProduct(Product product) {
		return (Product)getRepository(product.getType()).save(product);
	}
}
