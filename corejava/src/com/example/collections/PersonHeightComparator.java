package com.example.collections;

import java.util.Comparator;

import com.example.equals.Person;

public class PersonHeightComparator  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.getHeight()>=o2.getHeight()){
			if(o1.getHeight()==o2.getHeight())
				if(o1.getWeight()>o2.getWeight()) {
					return 1;	
				} else {
					return -1;
				}
				
			return 1;	
		} else {
			return -1;
		}
		
	}

	
	
}
