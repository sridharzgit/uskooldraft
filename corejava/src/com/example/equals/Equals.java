package com.example.equals;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		Person[] pary =  new Person[4]; 
		pary[0]= new Person("Sridhar",57);
		pary[1]= new Person("Madhu",55);
		pary[2]= new Person("Azhar",54);
		pary[3]= new Person("Ravuri",59);
		
		System.out.println(Arrays.toString(pary));
		Arrays.sort(pary);
		System.out.println(Arrays.toString(pary));
	}

}
