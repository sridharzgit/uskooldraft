package com.puzzle;

public class Traverse extends Thread {
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";
	public static final String FRONT = "FRONT";
	public static final String BACK = "BACK";

	String direction;
	int pzl[][];
	Point entry;
	Point end;
	public Traverse(int pzl[][], Point entryp,Point endp) {
		this.direction = direction;
		this.pzl = pzl;
		this.entry = entryp;
		this.end=endp;
	}

	public void run() {
		Point front= traverseFront(this.entry);
		Point currentPoint;
		if(checkIfEndPoint(front)){
			System.out.println("This is end point"+front);
		} else {
			currentPoint=front;
			//Point right= traverseRight(currentPoint);
			Point left = traverseLeft(currentPoint);
			if(validPoint(left) && currentPoint.equals(left)) {
				Point right= traverseRight(currentPoint);
				if(validPoint(right) && currentPoint.equals(right)){
					System.out.println("No route to puzzle stopped at"+right);
				} else {
					
				}
			}
			
			
		}
		
		
		Point right= traverseRight(this.entry);
		Point back= traverseBack(this.entry);
		if(this.end.equals(front)){
			System.out.println("This is end point"+left);
		} else{
			Point left = traverseLeft(this.entry);
		} else {
			
		}
			
			
			
			if(this.end.equals(front)) {
			System.out.println("This is end point"+front);
		} else if(this.end.equals(right)) {
			System.out.println("This is end point"+right);
		} else if(this.end.equals(back)) {
			System.out.println("This is end point"+back);
		} else {
			System.out.println("This is tmp end point for left"+left);
			System.out.println("This is tmp end point for front"+front);
			System.out.println("This is tmp end point for right"+right);
			System.out.println("This is tmp end point for back"+back);
		}
		//Point right= traverse();
		
		
	}

	public int getPointValue(Point p) {
		return this.pzl[p.getX()][p.getY()];
	}
	
	public boolean validPoint(Point p){
		
		if(p.getX()<this.pzl.length && p.getX() >= 0 ){
		int ary[]=this.pzl[p.getX()];
		  if(p.getY()<ary.length && p.getY() >= 0){
			  return true;
		  }else {
			  return false;
		  }
		} else {
			return false;
		}
		
		
		
	}

	public Point traverseLeft(Point p) {
		
		Point leftPoint = p.getLeftPoint();
		Point tmpPoint=p;
		if (leftPoint == null)   {
			System.out.println("No Left from here");
			tmpPoint= p;
		} else if (validPoint(leftPoint) && getPointValue(leftPoint) == 0) {
			System.out.println("Traversing at X="+leftPoint.getX()+" Y="+leftPoint.getY());
			tmpPoint= traverseLeft(leftPoint);
		} 
		return tmpPoint;
	}
	
	public Point traverseFront(Point p) {
		Point frontPoint = p.getFrontPoint();
		Point tmpPoint=p;
		if (frontPoint == null)   {
			System.out.println("No Left from here");
			tmpPoint= p;
		} else if (validPoint(frontPoint) && getPointValue(frontPoint) == 0) {
			
			
			System.out.println("Traversing at X="+frontPoint.getX()+" Y="+frontPoint.getY());
			Traverse t=new Traverse(pzl, frontPoint, end);
			t.start();
			tmpPoint= traverseFront(frontPoint);
		} 
		return tmpPoint;

	}
	
	public Point traverseRight(Point p) {
		Point rightPoint = p.getRightPoint();
		Point tmpPoint=p;
		if (rightPoint == null)   {
			System.out.println("No Left from here");
			tmpPoint= p;
		} else if (validPoint(rightPoint) && getPointValue(rightPoint) == 0) {
			System.out.println("Traversing at X="+rightPoint.getX()+" Y="+rightPoint.getY());
			Traverse t=new Traverse(pzl, rightPoint, end);
			t.start();
			tmpPoint= traverseRight(rightPoint);
		} 
		return tmpPoint;

	}
	
	public Point traverseBack(Point p) {
		Point backPoint = p.getBackPoint();
		Point tmpPoint=p;
		if (backPoint == null)   {
			System.out.println("No Left from here");
			tmpPoint= p;
		} else if (validPoint(backPoint) && getPointValue(backPoint) == 0) {
			System.out.println("Traversing at X="+backPoint.getX()+" Y="+backPoint.getY());
			Traverse t=new Traverse(pzl, backPoint, end);
			t.start();

			tmpPoint= traverseBack(backPoint);
		} 
		return tmpPoint;

	}
	
	public boolean checkIfEndPoint(Point p) {
		if(this.end.equals(p)){
			return true;
		} else {
			return false;
		}
	}
	
	
}
