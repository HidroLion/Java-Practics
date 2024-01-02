package inicio;
import java.util.HashMap;

public class ListaCanciones {
	public HashMap<String, String> crearLista(String[] nombre, String[] letra) {
		HashMap<String, String> playlist = new HashMap<String, String>();
		for(int i=0;i<nombre.length;i++) {
			playlist.put(nombre[i], letra[i]);
		}
		return playlist;
	}
}
