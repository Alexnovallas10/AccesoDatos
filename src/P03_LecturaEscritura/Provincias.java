package P03_LecturaEscritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Provincias {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File prov = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\provincias.txt");
		
		FileWriter fic = new FileWriter(prov);
		
		String provincias [] = new String[10];
		
		provincias[0] = "Teruel";
		provincias[1] = "Zaragoza";
		provincias[2] = "Cadiz";
		provincias[3] = "Sevilla";
		provincias[4] = "Navarra";
		provincias[5] = "La Rioja";
		provincias[6] = "Malaga";
		provincias[7] = "Soria";
		provincias[8] = "Valladolid";
		provincias[9] = "Valencia";

		
		
		
		
		for(int i = 0; i < provincias.length; i++){
			fic.write(provincias[i]+"\r\n");		
		}
		
		
		
		fic.close();
		
		
		
	}

}
