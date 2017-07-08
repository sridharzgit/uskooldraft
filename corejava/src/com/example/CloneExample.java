package com.example;

public class CloneExample {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Book b=new Book("One",200);
		System.out.println("Initial b"+b);
		b.setCost(300);
		System.out.println("Changed bcost"+b);
		Book c=(Book)b.clone();
		b.setCost(400);
		System.out.println("Changed bcost aftercloning"+b);
		System.out.println("C:"+c);
		c.setCost(100);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
	}
	

}




class Book implements Cloneable{
private String name;
private int cost;

Book(String name,int cost) {
	this.name=name;
	this.cost=cost;
}

public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}

@Override 
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}

@Override
public String toString(){
		return this.name+":"+this.cost;
	}
	
}