package inicio;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
	public ArrayList<Integer> mayores10(int[] lista){
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		int suma=0;
		for(int a:lista) {
			suma=suma+a;
			if(a>10) {
				mayores.add(a);
			}
		}
		return mayores;
	}
	
	public ArrayList<String> nombres(ArrayList<String> listaNombres){
		ArrayList<String> nombresLargos=new ArrayList<String>();
		Collections.shuffle(listaNombres);
		System.out.print(listaNombres);
		for(String b:listaNombres) {
			if(b.length()>5) {
				nombresLargos.add(b);
			}
		}
		return nombresLargos;
	}
	
	public void alfabeto() {
		ArrayList<Character> listaCaracteres = new ArrayList<Character>();
		for(char c = 'A';c <= 'Z';c++) {
			listaCaracteres.add(c);
		}
		Collections.shuffle(listaCaracteres);
		char ultimaLetra = listaCaracteres.get(0);
		char primeraLetra = listaCaracteres.get(listaCaracteres.size()-1);
		System.out.print("La Primera Letra es: "+primeraLetra+"\nLa Ultima Letra es: "+ultimaLetra);
		if(listaCaracteres.get(0) == 'A' || listaCaracteres.get(0) == 'E' || listaCaracteres.get(0) == 'I'|| listaCaracteres.get(0) == 'O'|| listaCaracteres.get(0) == 'U') {
			System.out.print("La primera Letra es una Vocal");
		}
	}
	
	public int[] numerosAleatorios() {
		int[] num=new int[10];
		Random r = new Random();
		for(int i=0;i<num.length;i++) {
			num[i]=r.nextInt(45)+55;
		}
		return num;
	}
	
	public ArrayList<Integer> ordenarAleatorios(int[] x){
		ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();
		for(int y:x) {
			listaOrdenada.add(y);
		}
		Collections.sort(listaOrdenada);
		System.out.print(listaOrdenada);
		System.out.print("\nMenor: "+listaOrdenada.get(0)+"\nMayor: "+listaOrdenada.get(listaOrdenada.size()-1));
		return listaOrdenada;
	}
	
	public String cadenaAleatoria() {
		ArrayList<Character> C = new ArrayList<Character>();
		String[] arregloCadena=new String[5];
		Random r = new Random();
		String cadena="";
		for(char c = 'A';c <= 'Z';c++) {
			C.add(c);
		}
		
		for(int i=0;i<5;i++) {
			arregloCadena[i]=(Character.toString(C.get(r.nextInt(C.size()-1))));
			cadena=cadena+arregloCadena[i];
		}
		return cadena;
	}
	
	public String[] arregloCadenas(String cadena) {
		String[] arreglo=new String[10];
		for(int i=0;i<10;i++) {
			arreglo[i]=cadenaAleatoria();
		}
		return arreglo;
	}
}
