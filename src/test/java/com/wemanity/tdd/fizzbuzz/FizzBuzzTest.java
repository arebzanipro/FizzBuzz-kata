/**
 * 
 */
package com.wemanity.tdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private String[] values = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
	
	private FizzBuzz fizzBuzz;

	@Before
	public void setUpBeforeClass() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void whenNotMultiple3And5() {
		assertEquals("1", fizzBuzz.evaluate(1));
	}

	@Test
	public void whenMultiple3ReturnFizz() {
		assertEquals("Fizz", fizzBuzz.evaluate(3));
	}

	@Test
	public void whenMultiple5ReturnBuzz() {
		assertEquals("Buzz", fizzBuzz.evaluate(5));
	}

	@Test
	public void whenMultiple3And5ReturnFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
	}

	@Test
	public void whenListOfInteger() {
		for(int index = 0; index < values.length; index++){
			assertEquals(values[index], fizzBuzz.evaluate(index+1));
		}
	}

}
