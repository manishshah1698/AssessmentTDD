package codes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {

	
	// Printing fizz for every multiple of 3.
	@Test
	public void testforDivisibleBy3() {
	FizzBuzz fb = new FizzBuzz();
	String result = fb.fiz(6);
	assertEquals("Fizz",result);
	}

	
}
