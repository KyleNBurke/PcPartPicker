package com.kyle.pcpartpicker.product;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.kyle.pcpartpicker.product.cpu.CPU;
import com.kyle.pcpartpicker.product.graphicscard.GraphicsCard;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = CPU.class, name = "cpu"),
	@JsonSubTypes.Type(value = GraphicsCard.class, name = "graphics-card")
})
public abstract class Product {
	@Id
	public String id;
	public String name = "";
	public float price = 0.0f;
	public String manufacturer = "";

	public abstract ProductType getType();
}
