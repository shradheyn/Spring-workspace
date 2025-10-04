package com.coforge.training.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.Product;

/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 27, 2025
* Time     : 10:24:23 AM
* Project  : spring-core
*/
@Configuration
@ComponentScan(basePackages="com.coforge.training.springcore.model")
public class ProductConfig {
	
	@Bean
	public Product p1() {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1500.00);
        return product;
    }
	
	@Bean
	public Product p2() {
        Product product = new Product();
        product.setName("Smartphone");
        product.setPrice(1300.00);
        return product;
    }
	
	@Bean
	public Product p3() {
        Product product = new Product();
        product.setName("Tablet");
        product.setPrice(600.00);
        return product;
    }

}
