package com.manthan.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.mantan.junit.Calculator;

class CalculatorTest {

	Calculator c;
	
	@BeforeEach
	public void createObj() {
		c=new Calculator();
	}
	
	@Test
	public void testAdd() {
		int res = c.add(20, 10);
		assertEquals(30, res);
	}
	@Test
	public void testDiv() {
		int res = c.div(20, 10);
		assertEquals(2, res);
	}
	@Test
	@Disabled
	public void testDivForException() {
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
		}
	
	
	@Test
	public void testMinus() {
		Calculator c = new Calculator()	;
		int res = c.minus(20, 10);
		assertEquals(10, res);
	}
	
}
