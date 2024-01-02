package inicio;

public class StringManipulador {
	public String trimAndConcat(String a, String b) {
		String c = "";
		c = a.trim()+b.trim();
		return c;
	}
	
	public int getIndexOrNull(String d, char e) {
		int f=0;
		f=d.indexOf(e);
		return f;
	}
	
	public int getIndexOrNull(String g, String h) {
		int i=0;
		i=g.indexOf(h);
		return i;
	}
	
	public String concatSubstring(String j, int k, int l, String m) {
		String n="";
		n=j.substring(k, l)+m;
		return n;
	}
}