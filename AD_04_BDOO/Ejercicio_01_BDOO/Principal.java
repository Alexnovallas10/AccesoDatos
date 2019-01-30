package Ejercicio_01_BDOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Principal {

	static ODB bd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			bd = ODBFactory.open("AD_04_BDOO\\MySql_a_Neodatis\\Data\\ARTICULOS.DAT");
			bd.close();
		
	}

}
