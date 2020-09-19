package codes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {

	@Test
	public void testfor3() {
	FizzBuzz fb = new FizzBuzz();
	String result = fb.fizzBuzz(3);
	assertEquals("3",result);
	
	}

}
