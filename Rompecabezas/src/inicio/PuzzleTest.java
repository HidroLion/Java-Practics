package inicio;

import java.util.ArrayList;

public class PuzzleTest {
    public static void main(String[] arg) {
    	PuzzleJava puzzle=new PuzzleJava();

    	int[] a = {3,5,1,2,7,9,8,13,25,32};
    	System.out.print(puzzle.mayores10(a));
    	
    	System.out.print("\n");
    	String[] b1 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    	ArrayList<String> b2 = new ArrayList<String>();
    	for(String b3:b1) {
    		b2.add(b3);
    	}
    	System.out.print(puzzle.nombres(b2));
    	
    	System.out.print("\n");
    	puzzle.alfabeto();
    	
    	System.out.print("\n");
    	int[] c = puzzle.numerosAleatorios();
    	for(int i=0;i<10;i++) {
    		System.out.print(c[i]+" ");
    	}
    	
    	System.out.print("\n");
    	puzzle.ordenarAleatorios(c);
    	
    	System.out.print("\n");
    	System.out.print(puzzle.cadenaAleatoria());
    	
    	System.out.print("\n");
    	String[] d1 = puzzle.arregloCadenas(puzzle.cadenaAleatoria());
    	for(String d2:d1) {
    		System.out.print(d2+" ");
    	}
    } 
}
