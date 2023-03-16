package org.howard.edu.hw5;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class IntegerSetTest {
	private IntegerSet set;
	private IntegerSet B;
	
	@BeforeEach
	void setup() {
		set =  new IntegerSet();
		B = new IntegerSet();
	}

	@Test
	@DisplayName("Test if length is correct. ")
	public void testlength() {
			int [] set = {1,2,3};
			Assert.assertEquals(2, set.length);
			int [] set2 = {};
			Assert.assertEquals(0, set2.length);
			int [] set3 = {1,2};
			Assert.assertEquals(2, set3.length);
	}
	
	@Test
	@DisplayName("Gives you the smallest number., throws exception if empty. ")
	public void testSmallest() throws IntegerSetException {
		int [] set = {1,3,5,9};
		Assert.assertEquals(1, set.smallest);
	}
	@Test
	public void testSmallest_exception() throws IntegerSetException {
		int [] set = {};
		Throwable exception = assertThrows(IntegerSetException.class, () -> set.smallest() );
		assertEquals("The current set is empty. ", exception.getMessage());
	}
	
	@Test
	@DisplayName("Gives largest value in list, throwsc exception if empty.")
	public void testLargest() throws IntegerSetException{
		
	}
	@Test
	public void testLargest_exception() throws IntegerSetException {
		int [] set = {};
		Throwable exception = assertThrows(IntegerSetException.class, () -> set.largest() );
		assertEquals("The current set is empty. ", exception.getMessage());
	}

	@Test
	@DisplayName("Checks if string is empty")
	public void testIsEmpty() {
		int [] set = {};
		Assert.assertTrue((true), set.isEmpty);
		
	}
}