package Ejercicio2;

import controllers.ControllerEquipos;
import controllers.ControllerJugador;

import javax.security.sasl.RealmCallback;

import Ejercicio2.Equipo;
import modelos.Jugador;

public class Demo {

	public static void main(String[] args) {
		
		//ControllerJugador controller = new ControllerJugador();
		ControllerEquipos controllerEquipos = new ControllerEquipos();
		
		//Inserta los datos correspondientes al Real Zaragoza, fundado en 1932. 59 Temporadas en primera división. 6 Copas del Rey.
		Equipo e12 = new Equipo("Real Zaragoza", 0, 0, 1932, 59);
		
		//Lista los equipos ordenados por ligas ganadas.
		controllerEquipos.viewEquipos();
		
		Equipo e13 = new Equipo("Barcelona", 23, 26, 1899, 83);
		controllerEquipos.update(e13);
		
		





	}

}