package com.example.immutable;

final public class Needle implements Cloneable{
	final private int size;
	final private int sharpness;
	public Needle(int size,int sharpness){
		this.size=size;
		this.sharpness=sharpness;
	}
	public int getSize() {
		return size;
	}
	public int getSharpness() {
		return sharpness;
	}
	
	@Override
	protected Needle clone() throws CloneNotSupportedException{
		return (Needle)super.clone();
	}
	
	
	
}
