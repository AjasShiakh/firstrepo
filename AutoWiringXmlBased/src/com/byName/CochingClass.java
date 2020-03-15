package com.byName;

public class CochingClass {
	
	private String cname;
	
	private  String caddress;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "CochingClass [cname=" + cname + ", caddress=" + caddress + "]";
	}
	
	

}
