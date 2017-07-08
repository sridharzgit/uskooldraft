package com.example;

public class Singleton {

	
	
	public static void main(String[] args) {
		Pet p=Pet.getPet();
		System.out.println(p);
		p.setCost(200);
		System.out.println(p);
		Pet g=Pet.getPet();
		System.out.println(g);
	
		
	}

}


class Pet {
private static Pet p;	
	
private String name;
private int cost;

private Pet() {
	this.name="Tony";
	this.cost=100;
}

public static Pet getPet(){
	if(p==null){
	p=new Pet();
	}
	return p;
}

public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}


@Override
public String toString(){
		return this.name+":"+this.cost;
	}
	
}