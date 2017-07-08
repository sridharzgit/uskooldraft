package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.example.equals.Person;

public class ListExampe {

	public static void main(String[] args) {
		
		List<Person> list= new LinkedList();
		
		Person p1=new Person("Sridhar", 45);
		Person p2=new Person("Madhu", 65);
		Person p3=new Person("Ravi", 12);
		Person p4=new Person("Azhar", 75);
		Person p5=new Person("Bhaji", 85);
		Person p6=new Person("Ravi", 14);
		Person p7=new Person("Ravi", 75);
		Person p8=new Person("Ravi", 95);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		
		System.out.println(list);
		list.remove(p8);
		System.out.println(list);
		List<Person> v=new Vector<>();
		v.add(p1);
		System.out.println(v);
			
		for(Person p: list) {
			System.out.println("--->"+p);
		}
		
		Iterator<Person> ip=list.iterator();
		
		while(ip.hasNext()){
			Person p=ip.next();
			System.out.println("###--->"+p);
		}
		
		list.forEach( p -> System.out.println("--->"+p)  );
		
		
		
		
	}

}
