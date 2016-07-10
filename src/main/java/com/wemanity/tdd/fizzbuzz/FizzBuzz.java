package com.wemanity.tdd.fizzbuzz;

/**
 * FizzBuzz
 *
 */
public class FizzBuzz {

	public String evaluate(int i) {
		StringBuffer result = new StringBuffer();
		if (aMultipleOfb(i, 3)) {
			result.append("Fizz");
		}
		if (aMultipleOfb(i, 5)) {
			result.append("Buzz");
		}
		if (result.toString().isEmpty()) {
			result.append(i);
		}

		return result.toString();
	}

	private boolean aMultipleOfb(int a, int b) {
		return (a % b) == 0;
	}
}
