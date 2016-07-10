/**
 * 
 */
package com.wemanity.tdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author uroot
 *
 */
public class FizzBuzzTest {
	private FizzBuzz fb;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUpBeforeClass() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void evaluateOne() {
		assertEquals("1", fb.evaluate(1));
	}

	@Test
	public void evaluateFizz() {
		assertEquals("Fizz", fb.evaluate(3));
	}

	@Test
	public void evaluateBuzz() {
		assertEquals("Buzz", fb.evaluate(5));
	}

	@Test
	public void evaluateFizzBuzz() {
		assertEquals("FizzBuzz", fb.evaluate(30));
	}

	@Test
	public void valuateFizzBuzz() {
		assertEquals("FizzBuzz", fb.evaluate(15));

	}

}
