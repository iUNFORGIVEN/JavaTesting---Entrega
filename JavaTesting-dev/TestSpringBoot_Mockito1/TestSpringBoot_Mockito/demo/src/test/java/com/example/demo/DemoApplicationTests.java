package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void calculateSum_basic() {
		DemoApplication business = new DemoApplication();
		int actualResult = business.calculateSum(new int[]{1, 2, 3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}


	@Test
	public void calculateSum_empty() {
		DemoApplication business = new DemoApplication();
		int actualResult = business.calculateSum(new int[] { });
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSum_oneValue() {
		DemoApplication business = new DemoApplication();
		int actualResult = business.calculateSum(new int[] { 5});
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateRest_basic() {
		DemoApplication business = new DemoApplication();
		int actualResult = business.calculateRest(new int[]{1, 2, 3});
		int expectedResult = -4;
		assertEquals(expectedResult, actualResult);
	}




}
