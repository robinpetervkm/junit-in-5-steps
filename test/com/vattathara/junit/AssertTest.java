package com.vattathara.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condition = true;
		assertEquals(1, 1);//import static method so we can use mothod with out its class name
		assertTrue(condition);
		assertFalse(condition);
//		assertNotNull(actual);
//		assertArrayEquals(expected, actual);
	}

}
