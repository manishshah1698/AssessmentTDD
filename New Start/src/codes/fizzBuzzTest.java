package codes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {

	// Printing fizzbuzz for every multiple of 3 and 5.
		@Test
		public void testforDivisibleBy15() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fiz(30);
		assertEquals("FizzBuzz",result);	
	}
		
	// Printing fizz for every multiple of 3.
	@Test
	public void testforDivisibleBy3() {
	FizzBuzz fb = new FizzBuzz();
	String result = fb.fiz(6);
	assertEquals("Fizz",result);
	}

	// Printing buzz for every multiple of 5.
		@Test
		public void testforDivisibleBy5() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fiz(10);
		assertEquals("Buzz",result);	
	}

}
