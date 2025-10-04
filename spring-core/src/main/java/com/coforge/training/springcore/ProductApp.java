package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.coforge.training.springcore.model.Product;

/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 27, 2025
* Time     : 10:23:33 AM
* Project  : spring-core
*/
public class ProductApp {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(ProductConfig.class);
		
		Product p1= context.getBean("p1",Product.class);
		Product p2= context.getBean("p2",Product.class);
		Product p3= context.getBean("p3",Product.class);
		
		System.out.println("product 1: "+p1);
		System.out.println("product 2: "+p2);
		System.out.println("product 3: "+p3);
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
