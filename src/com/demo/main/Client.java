package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		User user1 = context.getBean("user1",User.class);
		user1.service();
		
		
		User user2 = context.getBean("user2",User.class);
		user2.service();
	}

}
