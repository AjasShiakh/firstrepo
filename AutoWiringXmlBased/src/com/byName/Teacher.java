package com.byName;

public class Teacher {
	
	
	private int id;
	
	private String name;
	
	private CochingClass cochingClass;
	
	private CochingClass cochingClass1;

	public CochingClass getCochingClass1() {
		return cochingClass1;
	}

	public void setCochingClass1(CochingClass cochingClass1) {
		this.cochingClass1 = cochingClass1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CochingClass getCochingClass() {
		return cochingClass;
	}

	public void setCochingClass(CochingClass cochingClass) {
		this.cochingClass = cochingClass;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", cochingClass=" + cochingClass + ", cochingClass1="
				+ cochingClass1 + "]";
	}

	
	

}
