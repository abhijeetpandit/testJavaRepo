package org.abhijeet.springdemo.refdemo1;

import org.abhijeet.springdemo.beans.CustomSequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomDatePrefixCustomSequenceGenerator {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/abhijeet/springdemo/resources/beans.xml");
		CustomSequenceGenerator sequenceGenerator = (CustomSequenceGenerator) applicationContext.getBean("customDatePrefixCustomSequenceGenerator");
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
		System.out.println(sequenceGenerator.getNext());
	}
}
