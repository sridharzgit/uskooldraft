package com.example.collections;

import java.util.ArrayList;
import java.util.List;

import com.example.equals.Person;

public class Plainarray {

	public static void main(String[] args) {
		
		int z=20;
		int a[]=new int[4];
		int[] b=new int[4];
		Person[] c=new Person[4];
		List al=new ArrayList();
        Person p=new Person();   
		al.add(p);
		al.add("Hello");
		al.add(new Integer(2));
		for(int i=0;i<4;i++)
		System.out.println(a[i]);
		

	}

}
