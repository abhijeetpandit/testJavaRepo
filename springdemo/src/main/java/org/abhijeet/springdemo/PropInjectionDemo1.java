package org.abhijeet.springdemo;

import org.abhijeet.springdemo.beans.SequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropInjectionDemo1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/abhijeet/springdemo/resources/beans.xml");
		SequenceGenerator sequenceGenerator = (SequenceGenerator) applicationContext.getBean("propInjectedSequenceGenerator");
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
