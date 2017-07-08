package com.example;

class Abc {
	private String name;
	public void setName(String s){
		name=s;
	}
	
	public void printName(){
		System.out.println(name);;
	}
	
}


public class Test {
	public static void main(String[] args) {
		Abc abc=new Abc();
		abc.printName();
	}
}
