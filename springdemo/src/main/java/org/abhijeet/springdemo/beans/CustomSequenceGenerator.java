package org.abhijeet.springdemo.beans;

import org.abhijeet.springdemo.interfaces.PrefixGenerator;

public class CustomSequenceGenerator {
	private PrefixGenerator prefixGenerator;
	private String suffix = "";
	private int initial = 0;
	private int counter = 0;
	
	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getNext() {
		StringBuilder stringBuffer = new StringBuilder();
		stringBuffer.append(prefixGenerator.generatePrefix());
		stringBuffer.append(":");
		stringBuffer.append(initial + counter++);
		stringBuffer.append(suffix);
		return stringBuffer.toString();
	}
	
}
