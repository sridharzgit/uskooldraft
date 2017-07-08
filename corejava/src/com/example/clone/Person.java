package com.example.clone;

import java.io.Serializable;

public class Person implements Cloneable, Serializable  {
	private String name;
	private String age;
	private Address address;
	

	
	Person(String name, String age){
		this.name=name;
		this.age=age;
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;

	}




	public void setAge(String age) {
		this.age = age;
	}

	
	
	@Override
	public String toString(){
		return "Person: "+this.name+this.age+this.address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
