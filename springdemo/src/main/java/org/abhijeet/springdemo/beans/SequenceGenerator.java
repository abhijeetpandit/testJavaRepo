package org.abhijeet.springdemo.beans;

public class SequenceGenerator {
	private String prefix = "";
	private String suffix = "";
	private int initial = 0;
	private int counter = 0;
	
	public SequenceGenerator() {
		
	}
	
	public SequenceGenerator(String prefix, String suffix, int initial,
			int counter) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
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
