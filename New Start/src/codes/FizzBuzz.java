package codes;

public class FizzBuzz {
	public String fizzBuzz(int number)
	{
			return String.valueOf(number);
	}

	public String fizzBuzzDivisibleBy3(int i) {
		if(i % 3 == 0)
			return "Fizz";
		else
			return null;
	}

	public String fizzBuzzDivisibleBy5(int i) {
		if(i % 5 == 0)
			return "Buzz";
		else
			return null;
	}
}
