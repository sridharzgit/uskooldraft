package com.example;

public class Swap {
	public static void main(String[] args) {
		int x=30;
		int y=20;
		System.out.println("before swap x="+x+ "y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after  swap x="+x+ "y="+y);
	}
}
