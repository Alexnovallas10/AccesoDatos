package Conectores;

import java.sql.*;

public class Ejercicio_1 {
	  public static void main( String args[] ) {
	      Connection c = null;
	      Statement stmt = null;

	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:baseDeDatos.db");
		     System.out.println("Base de datos abierta con éxito");
		     
		     stmt = c.createStatement();
	         /*String sql = "CREATE TABLE COMPANY " +
	                        "(id INTEGER not NULL," +
	                        " marca VARCHAR(255), " + 
	     	                " modelo VARCHAR(255), " + 
	     	                " color VARCHAR(255), " + 
	     	                " motor INTEGER, " +
	     	                " potencia INTEGER, " +
	     	                " PRIMARY KEY ( id ))"; */
	        String sql;
	        sql=insertar();
	         
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  marca = rs.getString("marca");
	            String  modelo = rs.getString("modelo");
	            String  color = rs.getString("color");
	            int motor  = rs.getInt("motor");
	            int potencia  = rs.getInt("potencia");

	            
	            System.out.println( "Id = " + id );
	            System.out.println( "Marca = " + marca );
	            System.out.println( "Modelo = " + modelo );
	            System.out.println( "Color = " + color );
	            System.out.println( "Motor = " + motor );
	            System.out.println( "Potencia = " + potencia );
	            System.out.println();
	         }


	         
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();

	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	   }
	  
	  public static String insertar() {
		  String sql = "INSERT INTO COMPANY (id, marca, modelo, color, motor, potencia) " +
                  "VALUES (1, 'Mercedes', 'Benz', 'Negro', 3000, 260 );";
		return sql; 
		  
	  }
	  
	  public static void mostrar() {
		  
		  
	  }
	  
	 
		  
}
	 
	