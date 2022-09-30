package com.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.AddService;

class Calculator_TestCase{
	
	AddService service = new AddService();

	@Test
	void testAdd() {
		int a = service.add(4, 4);
		assertEquals(8, a);
	}
	
	@Test
	
void testMulti() {
		int a =  service.multiple(5, 4);
		assertEquals(20, a);
	}
	
	@Test
void testDiv() {
	int a = service.division(16, 4);
	assertEquals(4, a);
}
	@Test
void testSubtract() {
	int a =  service.subtract(18, 9);
	assertEquals(9, a);
}


}