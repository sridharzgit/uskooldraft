package com.example;

public class ThreadsExample {

	
	
	public static void main(String[] args) {
		ThreadOne t1= new ThreadOne();
		ThreadTwo r=new ThreadTwo();
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		
	}
	
}
