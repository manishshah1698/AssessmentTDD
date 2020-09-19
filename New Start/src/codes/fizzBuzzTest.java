package codes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {

	// Checking the number entered. 
	@Test
	public void testfor3() {
	FizzBuzz fb = new FizzBuzz();
	String result = fb.fizzBuzz(3);
	assertEquals("3",result);
	
	}
	
	// Printing fizz for every multiple of 3.
	@Test
	public void testforDivisibleBy3() {
	FizzBuzz fb = new FizzBuzz();
	String result = fb.fizzBuzzDivisibleBy3(6);
	assertEquals("Fizz",result);
	
	}

	// Printing buzz for every multiple of 5.
		@Test
		public void testforDivisibleBy5() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.fizzBuzzDivisibleBy5(10);
		assertEquals("Buzz",result);
		
		}
}
