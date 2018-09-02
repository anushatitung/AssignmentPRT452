package com.anusha.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculationTest {
	
	private Calculation ClassTest;

	@Before
	public void setUp() throws Exception {
		ClassTest = new Calculation();
		}

	@Test
	public void testgradient() {
		float x1 = 12;
		float y1 = 10;
		float x2 = 16;
		float y2 = 18;

		float result = (y2 - y1)/(x2 - x1);
		//compare to calculate java
		assertEquals(result, ClassTest.gradient(12, 10, 16, 18), 0.001);
		
	}

	@Test
	public void testdistance() {
		
		double x1 = 2;
		double y1 = 4;
		double x2 = 6;
		double y2 = 8;

		double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		//compare to calculate java
		assertEquals(res, ClassTest.distance(2, 4, 6, 8), 0.001);
	}

	@Test
	public void testequation() {
		
		double x1 =10;
		double y1=5;
		double gradient =15;
		double output = y1 - (gradient*x1);
		
		String result= "y -"+gradient+"x =" +output;
		assertEquals(result, ClassTest.equation(x1, y1, gradient));
		
	}

}
