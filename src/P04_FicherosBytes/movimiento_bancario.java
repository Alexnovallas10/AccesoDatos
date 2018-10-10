package P04_FicherosBytes;

public class movimiento_bancario {
	
	String fecha;
	String concepto;
	int cantidad;
	boolean tipo;
	
	
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
		return "Concepto: "+concepto; 
	}
	
	public String getcantidad() {
		return "Cantidad: "+cantidad; 
	}
	
	public String gettipo() {
		return "Tipo: "+tipo; 
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
