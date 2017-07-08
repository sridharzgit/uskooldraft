package com.example;

import com.example.Robot.RobotBuilder;

public class BuilderPattern {
	
	public static void main(String[] args ) {
		RobotBuilder rb=new Robot.RobotBuilder();
		rb.setBody("body");
		rb.setHands("two hands");
		rb.setHead("One Head");
		//rb.setLegs("Legs");
		Robot r= rb.build();
		System.out.println(r);
		
	}

}


