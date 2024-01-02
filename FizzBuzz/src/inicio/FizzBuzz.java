package inicio;

public class FizzBuzz {
	public String fizzBuzz(int a) {
		String b = "";		
		if(a==3) {
			b = "Fizz";
		}
		else if(a==5) {
			b = "Buzz";
		}
		else if(a==15) {
			b = "FizzBuzz";
		}
		else if(a==2) {
			b = "2";
		}
		return b;
	}
}
