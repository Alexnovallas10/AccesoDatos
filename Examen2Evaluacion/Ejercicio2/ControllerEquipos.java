package Ejercicio2;


import java.util.ArrayList;
import java.util.List;

import daos.JugadorDaoMySQLImp;
import daos.EquiposDaoMongoDBImp;
import daos.JugadorDaoMongoDBImp;
import idaos.EquiposDao;
import idaos.JugadorDao;
import modelos.Equipos;
import modelos.Jugador;
import vistas.ViewEquipos;
import vistas.ViewJugador;

public class ControllerEquipos {
	
private ViewEquipos vista = new ViewEquipos();
	
	
	public ControllerEquipos() {
	}
	
	public void create(Equipo equipo) {
		//EquiposDao dao = new EquiposDaoMySQLImp();
		EquiposDao daoMongo = new EquiposDaoMongoDBImp();
	//	dao.create(jugador);
		daoMongo.create(equipo);
	}
	
	public void update(Equipo equipo) {
		//JugadorDao dao = new JugadorDaoMySQLImp();
		//dao.update(equipo);
	}
	
	public void remove(Equipo equipo) {
		//JugadorDao dao = new JugadorDaoMySQLImp();
		//dao.delete(jugador);
	}
	
	public void viewEquipos() {
		
		/*List<Equipos> equipos = new ArrayList<Equipos>();
		JugadorDao dao = new JugadorDaoMySQLImp();
		
		
		 equipos = dao.read();
		 vista.viewTodosJugadores(equipos);*/
		
		
		
		EquiposDao daoMongo = new EquiposDaoMongoDBImp();
		List<Equipo> equiposMongo = new ArrayList<Equipo>();
		equiposMongo = daoMongo.read();
		vista.viewTodosEquipos((equiposMongo));
		
		
	}
	
	public void viewEquipos(Equipo equipo) {
		vista.viewEquipo(equipo);
	}
}
