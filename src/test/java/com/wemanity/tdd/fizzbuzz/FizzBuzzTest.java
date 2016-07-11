/**
 * 
 */
package com.wemanity.tdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
	private static FizzBuzz fizzBuzz;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void evaluateOne() {
		assertEquals("1", fizzBuzz.evaluate(1));
	}

	@Test
	public void evaluateFizz() {
		assertEquals("Fizz", fizzBuzz.evaluate(3));
	}

	@Test
	public void evaluateBuzz() {
		assertEquals("Buzz", fizzBuzz.evaluate(5));
	}

	@Test
	public void valuateFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.evaluate(15));

	}

}
