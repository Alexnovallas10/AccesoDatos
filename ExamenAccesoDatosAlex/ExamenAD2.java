import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ExamenAD2 {
	
	static Connection conexion;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Iniciando");	    
		    try {	    	
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        conexion = DriverManager.getConnection(
		        				"jdbc:mysql://www.db4free.net:3306/tubalcain",
		        				"tubalcain_dam","12345678");     
		       
		        //METODOS
		     
		        //insertar(1,"hola","Q tal");
		        //subirsueldo("2","1000");
		        //consultarDep(1);
		       

		       conexion.close();
		       System.out.println("Se ha cerrado la conexión");
		    }	    
		    catch ( Exception e){
		        e.printStackTrace();
		    }
	}
	public static void insertar(int numero,String nombre, String localidad) {
		String query = "INSERT INTO `DEPT`(`DEPTNO`, `DNAME`, `LOC`) "
				+ "VALUES ("+numero+","+nombre+","+localidad+")";
		Statement stmt = null;
        try {
            stmt = conexion.createStatement();        
            stmt.execute(query);
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();        
        } 
	}
	
	public static departamento consultarDep(int num) {
		String query = "SELECT * FROM `DEPT` WHERE `DEPTNO` = "+num+"";
		Statement stmt = null;
		 departamento dept = new departamento(); ; 
        try {
        	stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int numero;
            String nombre, localidad;   
            while (rs.next()){
	            numero = rs.getInt("DEPTNO");
	            nombre = rs.getString("DNAME");
	            localidad = rs.getString("LOC");
	            dept = new departamento(numero,nombre,localidad);          
	            System.out.println("Numero: " + numero + " Nombre: " + nombre+" Localidad: " + localidad);                       
            }
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();        
        } 
        return dept;
	}	
	
	public static void subirsueldo (String depa, String subid) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://www.db4free.net:3306/tubalcain",
					"tubalcain_dam", "12345678" ); 

			
			 String dep = depa;  // departamento
			 String subida = subid; // subida
			
			// construir orden DE LLAMADA
			String sql = "{ call subida_sal_alex (?, ?) } ";

			// Preparamos la llamada
			CallableStatement llamada = conexion.prepareCall(sql);
			// Damos valor a los argumentos
			llamada.setInt(1, Integer.parseInt(dep)); 
			llamada.setFloat(2, Float.parseFloat(subida)); 
															
			llamada.executeUpdate(); 
			System.out.println("Subida realizada....");
			llamada.close();
			conexion.close();
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

class departamento{
	int numero;
	String nombre;
	String localidad;
	
	public departamento() {
		 
	 }
	
	public departamento(int num, String nom, String loca) {
		this.numero=num;
		this.nombre=nom;
		this.localidad=loca;
	}
	 
	 
	 public int getNumero() {
		 return numero;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public String getLocalidad() {
		 return localidad;
	 }
	
	 public void setNumero(int numero) {
		 this.numero = numero;
	 }
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public void setLocalidad(String localidad) {
		 this.localidad = localidad;
	 }	
	 
	 public String mostrarDepartamento() {
		 return "Numero: " + numero + " Nombre: " + nombre+" Localidad: " + localidad;
	 }
}


