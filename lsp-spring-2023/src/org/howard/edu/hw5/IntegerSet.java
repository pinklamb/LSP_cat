package org.howard.edu.hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	

	public void clear() {
		set.clear();
	}

//returns length 
	
	public int length() {
		return set.size();
		
	}
	

// compares the 2 list if both are empty = true then it compares the size, if the size is the same it sorts the values and compares them returns true if they match 
	public boolean equals(List<Integer>B) {
		if (set == null) {
			if (B == null){
				return true;
			}
		}
		if (set.size() != B.size()) {
			return false;
		}else {
			Collections.sort(set);
			Collections.sort(B);
			return set.equals(B);
		}
	}
	 
// checks if value is in list
	public boolean contains(int a) {
		if (set.contains(a)){
			return true;
		}else{
			return false;
		}
	
	}
// returns the largest value of list	
	public int largest() throws IntegerSetException {
		if (set != null){
			return  Collections.max(set);
		}else {
			throw new IntegerSetException("The list is empty. ");
		}
	}
// returns smallest value of list
	public int smallest() throws IntegerSetException {
		if (set != null) {
			return Collections.min(set);
		}else {
			throw new IntegerSetException("The list is empty. ");
		}
	}
		
// adds number to end of list if it's not in there 
	public void add(int a) {
		if (set.contains(a) == false){
		set.add(a);
		
	}
}
// removes value if in list if not then it does nothing, it first gets the index of value that will be removed 
	public void remove(int item) {
		if (set.contains(item) == true){
			int indexval = set.get(item);
			set.remove(indexval);
		
		}
	}
	boolean isEmpty() {
		if (set == null) {
			return true;
		}else {
		return false;
		}
	}
	public String toString() {
		return set.toString();
	}
	
}