package codes;

public class FizzBuzz {

	public String fiz(int i) {
		if(i%3==0)
			return "Fizz";
		if(i%5==0)
			return "Buzz";
		else
			return String.valueOf(i);
	}
	
}
