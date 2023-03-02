package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSet {
	static ArrayList<Integer> numList = new ArrayList<Integer>();
	ArrayList<Integer> listB = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		emptyOut();
		
		
	}	
	public static void emptyOut() {
		numList.clear();
	}
	
	public void intLength() {
		numList.size();
	}
	
	public boolean compareList() {
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
	public boolean checkValue(int a) {
		if (numList.contains(a)){
			return true;
		}else{
		return false;
		}
		
	}
		
	public int largestValue() {
		return Collections.max(numList);
	}
	public int smallestValue() {
		return Collections.min(numList);
	}
	public void addNum(int item) {
		if (numList.contains(item) == false){
			numList.add(item);
		}
	}
	public void removeValue(int n) {
		if (numList.contains(n) == true){
			int indexval = numList.get(n);
			numList.remove(indexval);
			
		}
	}
}
