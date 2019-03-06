package Ejercicio1;

import java.io.File;
import java.util.Observable;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.omg.CORBA.PUBLIC_MEMBER;



public class Principal {
	static ODB odb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Examen2Evaluacion\\Ejercicio1\\equipos.db");
		f.delete();
		
		ODB odb = ODBFactory.open("Examen2Evaluacion\\Ejercicio1\\equipos.db");

		
		Equipo e1 = new Equipo("Recreativo de huelva", 0, 0, 1889, 5);
		Equipo e2 = new Equipo("Athletic Club", 8, 23, 1898, 83);
		Equipo e3 = new Equipo("Barcelona", 22, 26, 1899, 83);
		Equipo e4 = new Equipo("Espanyol",0 ,4, 1900,	79);
		Equipo e5 = new Equipo("Real Madrid", 32, 18, 1902,83);
		Equipo e6 = new Equipo("Sabadell",0,	0, 1903,14);
		Equipo e7 = new Equipo("Atlético de Madrid",	9,	10,	1903,	77);
		Equipo e8 = new Equipo("Sevilla",	1,	5,	1905,70);
		Equipo e9 = new Equipo("Sporting de Gijón", 0, 0, 1905, 40);
		/*Equipo Espanyol = new Equipo(Deportivo de La Coruña	1	2	1906	42);
		Equipo Espanyol = new Equipo(Betis	1	2	1907	49);
		Equipo Espanyol = new Equipo(Europa	–	–	1907	3);
		Equipo Espanyol = new Equipo(Levante	–	–	1909	9);
		Equipo Espanyol = new Equipo(Arenas	–	1	1909	7);
		Equipo Espanyol = new Equipo(Real Sociedad	2	1	1909	67);
		Equipo Espanyol = new Equipo(Cádiz	–	–	1910	12);
		Equipo Espanyol = new Equipo(Mérida	–	–	1912	2);
		Equipo Espanyol = new Equipo(Racing de Santander	–	–	1913	44);
		Equipo Espanyol = new Equipo(Gimnàstic de Tarragona	–	–	1914	4);
		Equipo Espanyol = new Equipo(Real Unión	–	4	1915	4);
		Equipo Espanyol = new Equipo(Mallorca	–	1	1916	27);
		Equipo Espanyol = new Equipo(Valencia	6	7	1919	79);
		Equipo Espanyol = new Equipo(Murcia	–	–	1920	18);
		Equipo Espanyol = new Equipo(Osasuna	–	–	1920	36);
		Equipo Espanyol = new Equipo(Alavés	–	–	1921	11);*/

		odb.store(e1);
		odb.store(e2);
		odb.store(e3);
		odb.store(e4);
		odb.store(e5);
		odb.store(e6);
		odb.store(e7);
		odb.store(e8);
		odb.store(e9);
		
		EquipoAntiguio();
		EquipoPrimera();
		
		odb.close();
	}
		
	
		public static void EquipoAntiguio() {
			
			ICriterion c = Where.not(Where.equal("ligas", 0));

			IQuery consulta = new CriteriaQuery(Equipo.class, Where.and().add(c)).orderByDesc("fundacion");

			
			Equipo equipo=(Equipo) odb.getObjects(consulta).getFirst();
			System.out.println("Equipo"+ equipo.getNombre());
			
		}
		
		public static void EquipoPrimera() {
			

			IQuery consulta = new CriteriaQuery(Equipo.class, Where.and()).orderByDesc("enprimera");
			

			
			Equipo equipo=(Equipo) odb.getObjects(consulta).getFirst();
			System.out.println("Equipo"+ equipo.getNombre());
			
		}


	

}
