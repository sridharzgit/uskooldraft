package com.puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Sridhar Veesam
 * Purpose: Path finding puzzle  
 * 
 */

public class FindPathPuzzle {
    
	//2D Array to hold puzzle 
	private int pzl[][];
	
	//Entry Point into puzzle
	private Point entryPoint;
	
	//Exit Point of puzzle
	private Point exitPoint;
	
	//Hash Map to store data related to each valid point in the puzzle and respective valid positions to move  
	private HashMap<Point, List<Point>> map;
	
	//Array list for holding the path of traversing
	private ArrayList<Point> path;
	
	// Exit Point found indicator, initialized to false 
	private boolean exitPointFoundInd=false;

	
	//constructor initializing puzzle data structure, entry point and exit points 
	FindPathPuzzle(int[][] pzl,Point entryP,Point exitP) {
		this.pzl=pzl;
		this.entryPoint=entryP;
		this.exitPoint=exitP;
		
		this.path=new ArrayList<Point>();
		//Adding entry point to the Path ArrayList
		this.path.add(this.entryPoint);
		
		//This method captures all valid points to move in the puzzle
		this.map=constructMap();
	}
	
	
    public static void main(String[] args) {

    	//Creating puzzle data structure in the form of 2D array 
    	// 1 represents green block in the given puzzle image, 0 represents white block (aisles)
    	int[] r1= {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
    	int[] r2= {1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1};
    	int[] r3= {1,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1};
    	int[] r4= {1,0,1,1,0,1,0,1,1,1,1,1,0,1,0,1};
    	int[] r5= {1,0,0,0,0,1,0,0,0,1,0,1,0,1,0,1};
    	int[] r6= {1,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1};
    	int[] r7= {1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1};
    	int[] r8= {1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1};
    	int[] r9= {1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1};
    	int[] r10={1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,1};
    	int[] r11={1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,1};
    	int[] r12={1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1};
    	int[] r13={1,0,1,1,1,1,1,1,0,0,1,1,1,1,0,1};
    	int[] r14={1,0,1,0,0,0,0,0,0,1,1,0,0,1,0,1};
    	int[] r15={1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,1};
    	int[] r16={1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1};

    	
		int[][] pzl={r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16};
		
		//Printing puzzle 
		
		System.out.println("\n     Puzzle ");
		for(int i=0;i<pzl.length;i++){
			System.out.println("");
			for(int j=0;j<pzl[i].length;j++){
				System.out.print(pzl[i][j]);
			}
		}
        // entry point 
		Point entryPoint=new Point(0,2);
        // exit point 		
		Point exitPoint=new Point(15,12);
		
		//Instatiating puzzle class with constructor, passing puzzle, entryPoint and exit Point
		FindPathPuzzle fpp=new FindPathPuzzle(pzl, entryPoint, exitPoint);
		
		//Print the path from Entry to exit 
		fpp.printPath();
		
	}

    
    public void printPath(){
 
    	System.out.println("\n\nTraversal Started, Entry point :"+this.entryPoint+ " Exit Point :"+this.exitPoint+"\n");
    	//System.out.print("Start =>");
    	traverse(this.entryPoint);
        System.out.println("Traversal Completed");

    }

    
  //Traverse to   
    public void traverse(Point p){
    	//Check if the point given as parameter is exit point or not , if yes set the exitPointFoundInd value true.
    	if(p.equals(this.exitPoint)) {
    		this.exitPointFoundInd=true;
			System.out.println("End Point" +p+" reached, below is the path:\n");
			System.out.print("Start => ");
			Iterator<Point> pathIterator= this.path.iterator();
			while(pathIterator.hasNext()){
				System.out.print(pathIterator.next()+" => ");	
			}
			
		} else if(!this.exitPointFoundInd) {
	    	List<Point> pl= (ArrayList<Point>)this.map.get(p);
	    	Iterator<Point> pi=pl.iterator();
	    	int duplicatePointsCount=0;
	    	List<Point> newStack=new ArrayList<>();;
			
	    	while(pi.hasNext()){
			Point tmpPoint=(Point)pi.next();
			//If point found is already exist do not add to array list because if it is added it forms a cycle and gets into infinite loop
			if(!path.contains(tmpPoint)){
				path.add(tmpPoint);
				//add the point to local stack... to remove the stack from path if no further progression in the path ..i.e dead-end reach and no exit point found 
				newStack.add(tmpPoint);
				//for each point traverse to explore the path
				traverse(tmpPoint);
				} else {
					duplicatePointsCount++;
				}
			
			}
			
	    	//if duplicate points found that means we require to come back from that location, as we can not further progress .. so removing the last element from path 
			if(duplicatePointsCount>0){
				Point lastElement=path.get((path.size()-1));
				path.remove(lastElement);
			}
			
			
			}
		}

    	
		
		
    
    
    //This method traverse through entire puzzle and finds out each valid position to move left/right/front/back and collects in to list adds to map
    // here key of the map is the point value is list of valid positions where traversal can be progressed.
	public HashMap<Point, List<Point>> constructMap() {
		HashMap<Point, List<Point>> map = new HashMap<>();
		int[][] pzl = this.pzl;
		for (int i = 0; i < pzl.length; i++) {
			
			for (int j = 0; j < pzl[i].length; j++) {
				if (pzl[i][j] == 0) {
					Point currentPoint = new Point(i, j);
					List<Point> pl = new ArrayList<>();
					Point left = currentPoint.getLeftPoint();
					Point right = currentPoint.getRightPoint();
					Point front = currentPoint.getFrontPoint();
					Point back = currentPoint.getBackPoint();

					if (isvalidHop(left)) {
						pl.add(left);
					}
					if (isvalidHop(right)) {
						pl.add(right);
					}
					if (isvalidHop(front)) {
						pl.add(front);
					}

					if (isvalidHop(back)) {
						pl.add(back);
					}
					if (pl.size() > 0) {
						map.put(currentPoint, pl);
					}

				}

			}
		}
//		System.out.println(map);
		return map;

	}    

    
    // This method returns value exist from the puzzle in the given point(location) 
	public int getPointValue(Point p) {
		return this.pzl[p.getX()][p.getY()];
	}

	//This method find whether the given point(location) is valid location to progress traversal i.e returns true -> if location is valid and holding zero 
	public boolean isvalidHop(Point p){
		if(validPoint(p) && getPointValue(p)==0){
			return true;
		} else {
			return false;
		}

	}
	//This method find whether the given point(location) is valid location or not in terms of puzzle boundaries
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
  

}




// Point class which takes only x,y parameters via constructor and no setter methods 
class  Point {
	private final int x;
	private final int y;
	
	//Constructor 
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//returns X location
	public int getX(){
		return x;
	}
	
	//returns Y location
	public int getY(){
		return y;
	}
	
	
	//This method calculates and returns immediate left side point location   
	public Point getLeftPoint(){
		return new Point(this.getX(),this.getY()-1);
	}
	
	//This method calculates and returns immediate right side point location
	public Point getRightPoint(){
		return new Point(this.getX(),this.getY()+1);
	}
	
	//This method calculates and returns immediate front side point location
	public Point getFrontPoint(){
		return new Point(this.getX()+1,this.getY());
	}
	
	//This method calculates and returns immediate back side point location
	public Point getBackPoint(){
		return new Point(this.getX()-1,this.getY());
	}
	
	
	@Override
	public boolean equals(Object p) {
		if (p != null) {
			Point othPoint = (Point) p;
			if (this.getX() == othPoint.getX() && this.getY() == othPoint.getY())
				return true;
			else
				return false;

		} else {
			return false;
		}
	}
	
	@Override
	//implementation of Hash code method 
	public int hashCode() {
		//non zero constant to calculate hashcode
		int result=17;
		result=31*result+this.getX();
		result=31*result+this.getY();
		
		String str=this.toString();
		
		result=31*result+str.hashCode();
		return result;
	}
	
	public String toString() {
		return "("+this.getX()+",  "+this.getY()+")";
	}

}



