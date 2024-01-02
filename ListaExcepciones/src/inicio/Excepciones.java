package inicio;
import java.util.ArrayList;

public class Excepciones {
    public static void main(String[] arg) {
    	ArrayList<Object> myList = new ArrayList<Object>();
    	myList.add("13");
    	myList.add("Hola Mundo");
    	myList.add(48);
    	myList.add("Adios Mundo");
    	
    	for(int i = 0; i < myList.size(); i++) {
    		try {
    			int castedValue = (int) myList.get(i);
    		}
    	    catch(ClassCastException error) {
    	    	System.out.print("\n"+myList.get(i)+": No es un numero > ");
    	    	System.out.print(error.getMessage());
    	    }
    	}
    }
}
