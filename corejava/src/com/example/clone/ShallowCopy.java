package com.example.clone;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Person p= new Person("Sri","20");
		System.out.println("P:"+p);
		//System.out.println("B:"+b);
		Address adr1=new Address("Miyapur", 123);
		p.setAddress(adr1);
		Person b=  (Person) p.clone();

		b.setAge("35");
		b.setName("Abhi");
		System.out.println("P after b age changed:"+p);
		System.out.println("B after b age changed:"+b);
		System.out.println("P after b age changed:"+p);
		adr1.setCityCode(111);
		System.out.println("P after b age changed:"+p);
		System.out.println("B after b age changed:"+b);

		//ShallowCopy s = new ShallowCopy();
		
		
		
	}

}




