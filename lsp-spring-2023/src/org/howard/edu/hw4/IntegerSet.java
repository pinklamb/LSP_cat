package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSet {
	static ArrayList<Integer> numList = new ArrayList<Integer>();
	static ArrayList<Integer> listB = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		emptyOut();
		intLength();
		compareList();
		checkValue(1);
		largestValue();
		smallestValue();
		addNum(3);
		removeValue(2);
	//returns all the functions 
	
		
	}	
	// clears out the elements in the list
	public static void emptyOut() {
		numList.clear();
	}
	// gets the length of the first list
	public static void intLength() {
		numList.size();
	}
	// compares the 2 list if both are empty = true then it compares the size, if the size is the same it sorts the values and compares them returns true if they match 
	public static boolean compareList() {
		if (numList == null) {
			if (listB == null){
				return true;
			}
		}
		 if (numList.size() != listB.size())  {
				return false;
		 }else {
		Collections.sort(numList);
		Collections.sort(listB);
		return numList.equals(listB);
		 }	
	}
	// checks if value is in list
	public static boolean checkValue(int a) {
		if (numList.contains(a)){
			return true;
		}else{
		return false;
		}
		
	}
	// returns the largest value of list	
	public static int largestValue() {
		return Collections.max(numList);
	}
	// returns smallest value of list
	public static int smallestValue() {
		return Collections.min(numList);
	}
	// adds number to end of list if it's not in there 
	public static void addNum(int item) {
		if (numList.contains(item) == false){
			numList.add(item);
		}
	}
	// removes value if in list if not then it does nothing, it first gets the index of value that will be removed 
	public static void removeValue(int n) {
		if (numList.contains(n) == true){
			int indexval = numList.get(n);
			numList.remove(indexval);
			
		}
	}
}
