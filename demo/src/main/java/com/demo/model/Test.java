package com.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Bike;
import com.demo.car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
			
			
			car c = (car) context.getBean("car");
			c.start();
			
			Bike bike = (Bike) context.getBean("bike");
			bike.start();
		
	}

}
