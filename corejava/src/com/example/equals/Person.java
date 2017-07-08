package com.example.equals;

public class Person implements Comparable<Person> {

	private String name;
	private int height;
	private int weight;
	public Person(){
		
	}
	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public int compareTo(Person other) {
        if(this.height<other.height) 
		return -1;
        else if(this.height>other.height)
        return 1;
        else 
        	return 0;	
	}
 
	 @Override
	 public String toString(){
		// return this.name+" height--Weight is:"+ this.height+ "--"+this.weight+"\n" ;
		 return " height--Weight is:"+ this.height+ "--"+this.weight+"\n" ;
		 
	 }
	 
	@Override
	public boolean equals( Object obj) {
		Person p=(Person) obj;
	    //return this.getHeight()==p.getHeight() && this.getName()==p.getName();
	    return this.getName()==p.getName();
	}
	@Override
	public int hashCode(){
		return this.getName().hashCode();
	}
	
	
	
}
