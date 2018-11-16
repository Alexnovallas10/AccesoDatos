package P03_LecturaEscritura;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficheroEscritura.txt");
		
		FileWriter fic = new FileWriter(f);
		
		String cad = "Tarazona Mo-la";
		
		char c_array[] = cad.toCharArray();
		
		for(int i = 0; i < c_array.length; i++){
			fic.write(c_array[i]);		
		}
		
		fic.append('*');//escribe al final del fichero
		
		fic.close();

	}

}
