package inicio;

public class FizzBuzzTest {
	public static void main(String[] arg) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String a = fizzBuzz.fizzBuzz(3);
		String b = fizzBuzz.fizzBuzz(5);
		String c = fizzBuzz.fizzBuzz(15);
		String d = fizzBuzz.fizzBuzz(2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}