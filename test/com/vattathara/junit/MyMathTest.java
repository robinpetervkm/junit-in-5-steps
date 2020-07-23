package com.vattathara.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	//MyMath.sum
	//1,2,3 = 6

	@Test
	public void sum_with3numbers() {
		
		//check that the result = 6
		// check result==6
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}
	
	@Test
	public void sum_with1numbers() {
		//check that the result = 1
		// check result==1
		assertEquals(1, myMath.sum(new int[] { 1}));
	}
	
	@Test
	public void sum_with2numbers() {
		//check that the result = 3
		// check result==3
		assertEquals(3, myMath.sum(new int[] { 1, 2}));//ALT+SHit +i ===>>In line
	}

}
