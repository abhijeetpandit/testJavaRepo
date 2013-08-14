package org.abhijeet.springdemo.beans;

public class SequenceGenerator {
	private String prefix = "";
	private String suffix = "";
	private int initial = 0;
	private int counter = 0;
	
	public SequenceGenerator() {
		
	}
	
	public SequenceGenerator(String prefix, int initial, String suffix) {
		this.prefix = prefix;
		this.initial = initial;
		this.suffix = suffix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getNext() {
		StringBuilder stringBuffer = new StringBuilder();
		stringBuffer.append(prefix);
		stringBuffer.append(initial + counter++);
		stringBuffer.append(suffix);
		return stringBuffer.toString();
	}
}
