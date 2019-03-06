package Ejercicio2;

import java.util.List;

import modelos.Equipos;
import modelos.Jugador;

public class ViewEquipos {
	
	public void viewEquipo(Equipo equipo) {
		System.out.println("Datos del equipo: " +equipo);
	}
	
	public void viewTodosEquipos(List<Equipo> equipos) {
		for (Equipo equipo: equipos) {
			System.out.println("Datos del equipo: "+ equipo);
		}
	}
}
