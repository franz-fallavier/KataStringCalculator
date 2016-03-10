
package com.hb.formation.KataStringCalculator.add;

import org.junit.*;

public class StringCalculatorTest {

	@Test
	public void givenEmptyString_whenAddNumbers_thenResultZero() {
		// Given
		StringCalculator sc = new StringCalculator();
		String emptyString = "";

		// When
		int result = sc.add(emptyString);

		// Then
		Assert.assertEquals(result, 0);
	}

	@Test
	public void givenOneNumber_whenAddNumbers_thenSameNumber() {
		// Given
		StringCalculator sc = new StringCalculator();
		String oneNumber = "3";

		// When
		int result = sc.add(oneNumber);

		// Then
		Assert.assertEquals(result, Integer.parseInt(oneNumber));
	}

	@Test
	public void givenTwoNumbers_whenAddNumbers_thenSum() {
		// Given
		StringCalculator sc = new StringCalculator();
		String numbers = "3,5";

		// When
		int result = sc.add(numbers);

		// Then
		Assert.assertEquals(result, 8);
	}
}
