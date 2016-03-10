
package com.hb.formation.KataStringCalculator.add;

public class StringCalculator {

	public int add(String numbers) {
		int count = numbers.split(",").length;
		System.out.println(count);
		// TODO verify content
		if (count == 1) {
			int first = Integer.parseInt(numbers);
			return first;
		}
		return 0;
	}
}
