package com;

public class College {
	
	
	private String cname;
	
	private String caddress;

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
		return "College [cname=" + cname + ", caddress=" + caddress + "]";
	}
	
	

}
