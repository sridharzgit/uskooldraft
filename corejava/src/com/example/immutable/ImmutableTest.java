package com.example.immutable;

public class ImmutableTest {
	
	public static void main(String[] args) throws Exception {
	 Needle n=new Needle(24,3);
	 System.out.println(n.getSharpness());
	 Needle k= (Needle)n.clone();
	 System.out.println(k.getSharpness());
	 System.out.println(n==k);
	 
		
	}

}
