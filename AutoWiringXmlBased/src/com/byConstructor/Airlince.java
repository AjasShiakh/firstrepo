package com.byConstructor;

public class Airlince {
	
	private int aid;
	
	private String aname;
	
	private Tickect tickect;
	
	private Tickect tickect1;
	
	public Airlince(int aid, String aname, Tickect tickect,Tickect tickect1) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.tickect = tickect;
		this.tickect1 = tickect1;
	}

	@Override
	public String toString() {
		return "Airlince [aid=" + aid + ", aname=" + aname + ", tickect=" + tickect + ", tickect1=" + tickect1+"]";
	}
	
	

}
