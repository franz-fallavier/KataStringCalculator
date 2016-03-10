
package com.hb.formation.KataStringCalculator.add;

import org.junit.*;

public class StringCalculatorTest {

	@Test
	public void givenEmptyString_WhenAddNumbers_ThenResultZero() {
		// Given
		StringCalculator sc = new StringCalculator();
		String emptyString = "";
		// When
		int result = sc.add(emptyString);
		// Then
		Assert.assertEquals(result, 0);
	}

	@Test
	public void givenOneNumber_WhenAddNumbers_ThenSameNumber() {
		// Given
		StringCalculator sc = new StringCalculator();
		String oneNumber = "3";
		// When
		int result = sc.add(oneNumber);
		// Then
		Assert.assertEquals(result, Integer.parseInt(oneNumber));
	}
}
