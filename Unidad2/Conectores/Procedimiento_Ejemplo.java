package Conectores;

import java.sql.*;

public class Procedimiento_Ejemplo {

	public static void main(String[] args) {
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://www.db4free.net:3306/tubalcain",
    				"tubalcain_dam",
    				"12345678"
    				);

			// recuperar parametros de main
			String dep = "1";   //"10"; // departamento
			String subida = "100000000";//"1000"; // subida
			
			// construir orden DE LLAMADA
			String sql = "{ call subida_sal_alex (?, ?) } ";

			// Preparamos la llamada
			CallableStatement llamada = conexion.prepareCall(sql);
			// Damos valor a los argumentos
			llamada.setInt(1, Integer.parseInt(dep)); // primer argumento-dep
			llamada.setFloat(2, Float.parseFloat(subida)); // segundo arg
															
			llamada.executeUpdate(); // ejecutar el procedimiento
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