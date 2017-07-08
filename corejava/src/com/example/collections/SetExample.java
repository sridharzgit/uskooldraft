package com.example.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.example.equals.Person;

public class SetExample {

	public static void main(String[] args) {

/*		Below is hashset and linked hash set examples
		
//		LinkedHashSet<Person> s =new LinkedHashSet<>();
		
		
		
		HashSet<Person> s =new HashSet<>();
		
		Person p1=new Person("Sridhar", 45);
		Person p2=new Person("Madhu", 65);
		Person p3=new Person("Ravi", 12);
		Person p4=new Person("Azhar", 75);
		Person p5=new Person("Bhaji", 85);
		Person p6=new Person("Ravi", 14);
		Person p7=new Person("Ravi", 75);
		Person p8=new Person("Ravi", 95);
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		s.add(p5);
		s.add(p6);
		s.add(p7);
		//s.remove(p8);
*/		
	
		TreeSet<Person> s = new TreeSet<>(new PersonHeightComparator());
		Person p1=new Person("Sridhar", 45,100);
		Person p2=new Person("Madhu", 12,102);
		Person p3=new Person("Ravi", 12,136);
		Person p4=new Person("Azhar", 75,113);
		Person p5=new Person("Bhaji", 85,115);
		Person p6=new Person("Ravi", 12,135);
		Person p7=new Person("Ravi", 12,123);
		Person p8=new Person("Ravi", 12,144);
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		s.add(p5);
		s.add(p6);
		s.add(p7);
		
		System.out.println(s);
		
		
		
		
		
	}

}
