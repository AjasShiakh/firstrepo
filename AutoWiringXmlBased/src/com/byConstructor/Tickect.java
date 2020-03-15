package com.byConstructor;

public class Tickect {
	
	private String from;
	
	private String to;

	public Tickect(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Tickect [from=" + from + ", to=" + to + "]";
	}
	
	

}
