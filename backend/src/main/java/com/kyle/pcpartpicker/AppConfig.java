package com.kyle.pcpartpicker;

import com.kyle.pcpartpicker.product.ProductTypeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class AppConfig extends WebMvcConfigurationSupport {
	@Override
	public FormattingConversionService mvcConversionService() {
		FormattingConversionService f = super.mvcConversionService();
		f.addConverter(new ProductTypeConverter());
		return f;
	}
}
