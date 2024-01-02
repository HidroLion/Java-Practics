package inicio;

public class ProjectTest {
    public static void main(String[] arg) {
    	Project proyecto1 = new Project();
    	Project proyecto2 = new Project("Proyecto2");
    	Project proyecto3 = new Project("Proyecto3", "Tercer Proyecto Creado");
    	
    	proyecto1.elevatorPitch();
    	proyecto2.elevatorPitch();
    	proyecto3.elevatorPitch();
    }
}
