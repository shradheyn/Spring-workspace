package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Book;

/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 26, 2025
* Time     : 4:37:12 PM
* Project  : spring-core
*/
public class BookApp {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("BookConfig.xml");
		
		Book b1=(Book) context.getBean("book1");
		Book b2=(Book) context.getBean("book2");
		Book b3=(Book) context.getBean("book3");
		
		b1.display();
		b2.display();
		b3.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
