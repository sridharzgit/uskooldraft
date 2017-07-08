package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.example.equals.Person;

public class MapExamples {

	public static void main(String[] args) {
		Map<Integer,Person> m = new HashMap();
		Person p1=new Person("Sridhar", 45,100);
		Person p2=new Person("Madhu", 12,102);
		Person p3=new Person("Ravi", 12,136);
		Person p4=new Person("Azhar", 75,113);
		Person p5=new Person("Bhaji", 85,115);
		Person p6=new Person("Ravi", 12,135);
		Person p7=new Person("Ravi", 12,123);
		Person p8=new Person("Ravi", 12,144);
		
		m.put(1,p1);
		m.put(2,p2);
		m.put(3,p3);
		m.put(6,p6);
		m.put(7,p7);
		m.put(4,p4);
		m.put(5,p5);
		
		System.out.println(m);
		
		Set<Integer> ks= m.keySet();
		for(Integer i:ks){
			System.out.println(m.get(i));
		}
		
	}

}
