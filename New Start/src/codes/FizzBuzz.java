package codes;

public class FizzBuzz {

	public String fiz(int i) {
		if(i%15==0)
			return "FizzBuzz";
		if(i%3==0 || i %10 ==3 || i/10 == 3)
			return "Fizz";
		if(i%5==0 || i %10 ==5 || i/10 == 5)
			return "Buzz";
		else
			return String.valueOf(i);
	}
	public static void main(String []args)
	{
		FizzBuzz f = new FizzBuzz();
		for(int i=1;i<=100;i++)
		{
			System.out.println(f.fiz(i));
		}
		
	}
	
}
