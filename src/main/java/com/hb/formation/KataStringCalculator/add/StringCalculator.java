
package com.hb.formation.KataStringCalculator.add;

public class StringCalculator {

	/**
	 * Addition numbers
	 * @param numbers 
	 * @return the sum of numbers
	 */
	public int add(String numbers) {
		int sum = 0;
		if ( !numbers.isEmpty() ) {
			String [] splitedNumbers = numbers.split(",");
			for(String number: splitedNumbers) {
				sum += Integer.parseInt(number);			
			}			
		}
		return sum;
	}
}
