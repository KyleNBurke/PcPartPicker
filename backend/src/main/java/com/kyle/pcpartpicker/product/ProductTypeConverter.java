package com.kyle.pcpartpicker.product;

import org.springframework.core.convert.converter.Converter;

public class ProductTypeConverter implements Converter<String, ProductType> {
	@Override
	public ProductType convert(String s) {
		try {
			return ProductType.valueOf(s);
		} catch(Exception e) {
			return null;
		}
	}
}
