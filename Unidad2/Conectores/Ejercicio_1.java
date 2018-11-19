package Conectores;

import java.sql.*;

public class Ejercicio_1 {
	  public static void main( String args[] ) {
	      Connection c = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:baseDeDatos.db");
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Base de datos abierta con éxito");
	   }
	}