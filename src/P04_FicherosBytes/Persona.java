package P04_FicherosBytes;

import java.io.Serializable;

public class Persona implements Serializable {

	private int edad;
	private String nombre;
	
	public Persona(int e, String n) {
		edad=e;
		nombre=n;
	}
	
	public String getnombre() {
		return " 	Nombre: "+nombre; 
	}
	
	public String getedad() {
		return " 	Edad: "+edad; 
	}
	
	public void setnombre(String n) {
		nombre=n; 
	}
	
	public void setedad(int e) {
		edad=e; 
	}
	
	
}
