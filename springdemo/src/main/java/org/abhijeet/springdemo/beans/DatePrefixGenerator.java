package org.abhijeet.springdemo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.abhijeet.springdemo.interfaces.PrefixGenerator;

public class DatePrefixGenerator implements PrefixGenerator {

	private String pattern = "dd/MM/yyyy";
	
	public DatePrefixGenerator() {
		
	}
	
	public DatePrefixGenerator(String pattern) {
		this.pattern = pattern;
	}
	
	public String generatePrefix() {
		return new SimpleDateFormat(pattern).format(new Date());
	}
}
