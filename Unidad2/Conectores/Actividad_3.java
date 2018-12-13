package Conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Actividad_3 {
	 static Connection con ;
public static void main(String[] args) {
	    
	    System.out.println("Iniciando");
	    
	    // Creando la conexión
	    try {
	    	
	        Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection(
	        				"jdbc:mysql://www.db4free.net:3306/alexnvlls",
	        				"alexnvlls",
	        				"12345678"
	        				); 
	      
		    
	        //insertarDepartamento(70,"Informat", "Zara");
	     DepartamentoActividad3 d = new DepartamentoActividad3(80,"Markt","Zar");
	     insertarDepartamento2(d);
		  // consultar(10);

	       
	       con.close();

	    }
	    catch ( Exception e){
	        e.printStackTrace();
	    }
	}

	public static void insertarDepartamento (int numero, String nombre, String localidad) {
		String query = "INSERT INTO `DEPT`(`DEPTNO`, `DNAME`, `LOC`)"+" VALUES ("+numero+",'"+nombre+"','"+localidad+"')";
		 Statement stmt = null;
	        try {
	            stmt = con.createStatement();
	            stmt.executeQuery(query);
	            stmt.close();  
	        }
	        catch (SQLException e){
	            e.printStackTrace();	            
	        } 
		}
	
	public static void insertarDepartamento2(DepartamentoActividad3 d) {
			String query = "INSERT INTO `DEPT`(`DEPTNO`, `DNAME`, `LOC`) "
					+ "VALUES ("+d.getnumero()+","+d.getNombre()+","+d.getLocalidad()+")";
			Statement stmt = null;
	        try {
	            stmt = con.createStatement();        
	            stmt.execute(query);
	            stmt.close();
	        }
	        catch (SQLException e){
	            e.printStackTrace();        
	        } 
		}
	
	
	
	//Método que devuelva un ArrayList de objetos departamento ante la consulta de todas las columnas de todos los departamentos de la tabla dept
	
	
	
	
	
	
	
	
	
	
	public static DepartamentoActividad3 consultar(int num) {
		String query = "SELECT * FROM `DEPT` WHERE `DEPTNO` = "+num+"";
		Statement stmt = null;
		DepartamentoActividad3 d = new DepartamentoActividad3(); ; 
        try {
        	stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int numero;
            String nombre, localidad;   
            while (rs.next()){
	            numero = rs.getInt("DEPTNO");
	            nombre = rs.getString("DNAME");
	            localidad = rs.getString("LOC");
	            d = new DepartamentoActividad3(numero,nombre,localidad);          
	            System.out.println("Numero: " + numero + " Nombre: " + nombre+" Localidad: " + localidad);                       
            }
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();        
        } 
        return d;
	}
	
	
	
	
	
	    
}
	 
