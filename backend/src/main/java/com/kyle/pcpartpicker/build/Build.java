package com.kyle.pcpartpicker.build;

import com.kyle.pcpartpicker.product.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "build")
public class Build {
	@Id
	public String id;
	public String title;
	@DBRef
	public List<Product> products;
}
