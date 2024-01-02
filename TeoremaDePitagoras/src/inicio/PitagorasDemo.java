package inicio;
import java.lang.Math;

public class PitagorasDemo {
	public double calcularHipotenusa(int a, int b) {
		double c;
		c = a*a + b*b;
		c = Math.sqrt(c);
		
		return c;
	}
}
