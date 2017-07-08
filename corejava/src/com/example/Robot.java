package com.example;

public class Robot {

	private String head;
	private String hands;
	private String body;
	private String legs;
	
	private Robot(RobotBuilder rb){
		if(rb==null || rb.getBody()==null || rb.getHead()==null || rb.getHands()==null ||rb.getLegs()==null){
		throw new IllegalStateException();	
		}
		
		this.head=rb.getHead();
		this.body=rb.getBody();
		this.legs=rb.getLegs();
		this.hands=rb.getHands();
	}
	
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getHands() {
		return hands;
	}
	public void setHands(String hands) {
		this.hands = hands;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	
	public static class RobotBuilder {
		private String head;
		private String hands;
		private String body;
		private String legs;
		
		RobotBuilder(){
		}
		
		public String getHead() {
			return head;
		}
		public void setHead(String head) {
			this.head = head;
		}
		public String getHands() {
			return hands;
		}
		public void setHands(String hands) {
			this.hands = hands;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getLegs() {
			return legs;
		}
		public void setLegs(String legs) {
			this.legs = legs;
		}
		
		public Robot build() {
			Robot r =new Robot(this);
			return r;
		}
		
	}
	
@Override
public String toString(){
	return this.head+this.hands+this.legs+this.body;
}
	
	
	
}
