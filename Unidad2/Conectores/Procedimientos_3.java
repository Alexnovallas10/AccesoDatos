package Conectores;

import java.sql.*;

public class Procedimientos_3 {
	public static void main(String[] args) {
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://www.db4free.net:3306/tubalcain",
    				"tubalcain_dam",
    				"12345678"
    				);

			// recuperar parametros de main
			int dep = 10;   //"10"; // departamento
			
			// construir orden DE LLAMADA
			String sql = "{ ? = call datos_dep_alex (?, ?, ?) } ";

			// Preparamos la llamada
			CallableStatement llamada = conexion.prepareCall(sql);
			
			llamada.registerOutParameter(2, Types.VARCHAR);
			llamada.registerOutParameter(3, Types.VARCHAR);

			// Damos valor a los argumentos
			llamada.setInt(1, dep); // primer argumento-dep
															
			llamada.execute(); // ejecutar el procedimiento
			System.out.println("Subida realizada....");
			System.out.println(" Nombre: "+llamada.getString(2)+" localidad: "+llamada.getString(3));
			llamada.close();
			conexion.close();
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

