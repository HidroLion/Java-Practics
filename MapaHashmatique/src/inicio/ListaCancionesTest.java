package inicio;

import java.util.HashMap;
import java.util.Set;

public class ListaCancionesTest {
    public static void main(String[] arg) {
    	HashMap<String, String> playlist = new HashMap<String, String>();
        ListaCanciones lista = new ListaCanciones();
        String[] titulos = {"Time Left", "Kaibutsu", "Sugar Song", "Mephisto"};
        String[] letras = 
        	{"La primera vez que probe el amor era salado \n"
        			+ "Estoy desesperada, la pobreza es lo mas comun \n"
        			+ "Le doy la bienvenida a un cuerpo mas sano lleno de ajo \n"
        			+ "Me lleno el estomago de canciones",
        			
        	"Ah, Saludare a este maravilloso mundo \n"
        	+ "Las risas vuelan por la ciudad \n"
        	+ "Solo estoy pretendiendo no verlas \n"
        	+ "Me siento como...",
        	
        	"Estoy tan acostumbrado a la locura de este desastre sobrenatural \n"
        	+ "Que veo con tranquidad y paz a esta extraña vida diaria \n"
        	+ "Esta montaña rusa comenzo a sacudirnos \n"
        	+ "Que era lo que no debiamos perder?",
        	
        	"Mis dedos anhelan una ultima oportunidad \n"
        	+ "Mientras bailaba y corria en el cielo nocturno \n"
        	+ "Una postura ordinaria no podria detenerme \n"
        	+ "Las estrellas anhelan joyas"};
        
        playlist = lista.crearLista(titulos, letras);
        Set<String> keys = playlist.keySet();
        for(String k:keys) {
        	System.out.println("\n\n");
        	System.out.println(k + ":");
            System.out.println(playlist.get(k));
        }
    }
}
