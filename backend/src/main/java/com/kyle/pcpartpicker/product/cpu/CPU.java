package com.kyle.pcpartpicker.product.cpu;

import com.kyle.pcpartpicker.product.Product;
import com.kyle.pcpartpicker.product.ProductType;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cpu")
public class CPU extends Product {
	public String series = "";
	public int cores = 0;
	public float coreClock = 0.0f;
	public int TDP = 0;

	@Override
	public ProductType getType() {
		return ProductType.cpu;
	}
}
