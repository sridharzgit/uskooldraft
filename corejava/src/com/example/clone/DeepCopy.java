package com.example.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCopy {

	public static void main(String[] args)  throws CloneNotSupportedException, IOException, Exception{
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

		//above is shallow copy
		
		//Deep copy implementation
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(p);
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois= new ObjectInputStream(bais);
		Person c=(Person)ois.readObject();
		
		c.getAddress().setCity("ChandaNagar");
		c.getAddress().setCityCode(223);
		System.out.println(p);
		System.out.println(c);


	}

}
