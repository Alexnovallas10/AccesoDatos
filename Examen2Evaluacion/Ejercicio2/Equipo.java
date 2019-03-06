package Ejercicio2;

public class Equipo {
	
	String nombre;
	int ligas, copas, fundacion, enprimera;

	
	public Equipo() {
		
	}
	
	public Equipo(String nombre, int ligas, int copas, int fundacion, int enprimera) {
		super();
		this.nombre = nombre;
		this.ligas = ligas;
		this.copas = copas;
		this.fundacion = fundacion;
		this.enprimera = enprimera;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLigas() {
		return ligas;
	}


	public void setLigas(int ligas) {
		this.ligas = ligas;
	}


	public int getCopas() {
		return copas;
	}


	public void setCopas(int copas) {
		this.copas = copas;
	}


	public int getFundacion() {
		return fundacion;
	}


	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}


	public int getEnprimera() {
		return enprimera;
	}


	public void setEnprimera(int enprimera) {
		this.enprimera = enprimera;
	}
	
	
	
}
