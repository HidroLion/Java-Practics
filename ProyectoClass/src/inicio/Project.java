package inicio;

public class Project {
	String nombre;
	String descripcion;
	
	public Project() {
		
	}
	public Project(String nombre) {
		this.nombre = nombre;
	}
	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre () {
		return nombre;
	}
	public String getDescripcion () {
		return descripcion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void elevatorPitch() {
		System.out.println(nombre+": "+descripcion); 
	}
}
