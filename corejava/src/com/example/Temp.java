package com.example;

public class Temp {

	public static void main(String[] args) {
	
		Temp t= new Temp();
		System.out.println(t.calc(3, 3));
	}
	
	public int calc(int a, int b) throws ArithmeticException {
		return 10/0;
	}

}
