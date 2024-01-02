package inicio;
import java.util.ArrayList;

public class BasicJava {
	//Imprimir 1 - 255
	public void imprimir255() {
		for(int i=0; i< 255; i++) {
			System.out.print("\n"+i);
		}
	}
	
	//Imprimir los Números Impares Entre 1 - 255
	public void imprimirImpares() {
		for(int i=0; i<255; i++) {
			if(i%2!=0) {
				System.out.print("\n"+i);
			}
		}
	}
	
	//Imprimir la Suma
	public void imprimirSuma() {
		int suma=0;
		for(int i=0; i<255; i++) {
			suma=suma+i;
			System.out.print("\nNuevo Numero: "+i+" Suma: "+suma);
		}
	}
	
	//Recorrer un Arreglo
	public void recorrerArreglo(int[] x) {
		for(int a:x) {
			System.out.print("\n"+a);
		}
	}
	
	//Encontrar el Máximo
	public int enontrarMaximo(int[] x) {
		int max=0;
		for(int b:x) {
			if(b>max) {
				max=b;
			}
		}
		return max;
	}
	
	//Obtener el Promedio
	public float obtenerPromedio(int[] z) {
		int suma=0;
		float promedio=0;
		for(int c:z) {
			suma=suma+c;
		}
		promedio=suma/z.length;
		return promedio;
	}
	
	//Arreglo con Números Impares
	public ArrayList<Integer> arregloConImpares() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for(int i=0; i<255; i++) {
			if(i%2!=0) {
				numeros.add(i);
			}
		}
		return numeros;
	}
	
	//Mayor que Y
	public int mayorQueY(int[] num, int Y) {
		int mY=0;
		for(int o:num) {
			if(o>Y) {
				mY++;
			}
		}
		return mY;
	}
	
	//Valores al Cuadrado
	public ArrayList<Integer> valoresCuadrado(int[] p) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		for(int i=0;i<p.length;i++) {
			s.add(p[i]*p[i]);
		}
		return s;
	}
	
	//Eliminar Números Negativos
	public ArrayList<Integer> eliminarNegativos(int[] b) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<b.length;i++) {
			if(b[i]>=0) {
				a.add(b[i]);
			}
			else {
				a.add(0);
			}
		}
		return a;
	}
	
	//Mínimo, Máximo y Promedio
	public int[] minimiMaximoPromedio(int[] w) {
		int[] minMaxProm = new int[3];
		int suma=0;
		int max=0;
		int min=10000;
		int promedio=0;
		for(int c:w) {
			if(c>max) {
				max=c;
			}
			if(c<min) {
				min=c;
			}
			suma=suma+c;
		}
		promedio=suma/w.length;		
		minMaxProm[0]=min;
		minMaxProm[1]=max;
		minMaxProm[2]=promedio;		
		return minMaxProm;
	}
	
	//Cambiando los Valores del Arreglo
	public int[] cambiarArreglo(int[] q) {
		for(int i=0;i<q.length - 1;i++) {
			q[i] = q[i+1];
		}
		q[q.length - 1] = 0;
		return q;
	}
}
