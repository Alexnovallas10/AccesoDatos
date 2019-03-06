package Ejercicio2;

import java.util.List;

import modelos.Equipos;


import java.util.List;

import modelos.Equipos;
import modelos.Jugador;

public interface EquiposDao {
	
	public boolean create(Equipo equipo);
	public List<Equipo>read();
	public boolean update(Equipo equipo);
	public boolean delete(Equipo equipo);
	
}