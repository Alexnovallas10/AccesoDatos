package P04_FicherosBytes;
import java.io.Serializable;

public class movimiento_bancario implements Serializable{
	
	private String fecha;
	private String concepto;
	private int cantidad;
	private boolean tipo;
	
	
	public movimiento_bancario(String f, String c, int can, boolean t) {
		fecha=f;
		concepto=c;
		cantidad=can;
		tipo=t;
	}
	

	public String getfecha() {
		return "Fecha: "+fecha; 
	}
	
	public String getconcepto() {
		return " Concepto: "+concepto; 
	}
	
	public int getcantidad() {
		return cantidad; 
	}
	
	public boolean gettipo() {
		return tipo; 
	}
	
	public void setfecha(String f) {
		fecha=f; 
	}
	
	public void setconcepto(String c) {
		concepto=c; 
	}
	
	public void setcantidad(int can) {
		cantidad=can; 
	}
	
	public void settipo(boolean t) {
		tipo=t; 
	}
	
	
}
