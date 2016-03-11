
package com.hb.formation.KataStringCalculator;

public class StringCalculator {

	public int add(String numbers) {
		int sum = 0;
		if (!numbers.isEmpty()) {
			String[] arNumbers = numbers.split("\\n|,");
			for (String number : arNumbers) {
				sum += Integer.parseInt(number);
			}
		}
		return sum;
	}
}
