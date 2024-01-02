package inicio;
import java.util.ArrayList;

public class BasicJavaTest {
    /**
     * @param arg
     */
    public static void main(String[] arg) {
        BasicJava basic = new BasicJava();
        basic.imprimir255();
        
        System.out.print("\n");
        basic.imprimirImpares();
        
        System.out.print("\n");
        basic.imprimirSuma();
        
        System.out.print("\n");
        int[] x = {1,3,5,7,122,13};
        basic.recorrerArreglo(x);
        
        System.out.print("\n");
        int y = basic.enontrarMaximo(x);
        System.out.print("\n"+y);
        
        System.out.print("\n");
        int[] z = {2,3,10};
        float prom=basic.obtenerPromedio(z);
        System.out.print("\n"+prom);
        
        System.out.print("\n");
        ArrayList<Integer> impares = new ArrayList<Integer>();
        impares = basic.arregloConImpares();
        System.out.print("\n"+impares);
        
        System.out.print("\n");
        int[] numeros = {1,3,5,7};
        int mayoresY=basic.mayorQueY(numeros, 3);
        System.out.print("\n"+mayoresY);
        
        System.out.print("\n");
        int[] c = {1,5,10,-2};
        System.out.print("\n"+basic.valoresCuadrado(c));
        
        System.out.print("\n");
        int[] a = {1,5,10,-2};
        System.out.print("\n"+basic.eliminarNegativos(a));
        
        System.out.print("\n");
        int[] b1 = {1,5,10,-2};
        int[] b2 = basic.minimiMaximoPromedio(b1);
        System.out.print("\n["+b2[0]+", "+b2[1]+", "+b2[2]+"]");
        
        System.out.print("\n");
        int[] arr = {1,5,10,7,-2};
        arr = basic.cambiarArreglo(arr);
        System.out.print("\n[");
        for(int k:arr) {
        	System.out.print(" "+k+" ");
        }
        System.out.print("]");
    }
}
