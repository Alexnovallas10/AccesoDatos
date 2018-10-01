package P03_LecturaEscritura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaEscritura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\fichero.txt");
				
		

			FileReader fic = new FileReader(f);
			int i; //caracter actual
			while((i=fic.read())!=-1) {
				System.out.print((char)i);		
				}
				
				
				
				
				
		
			
		
		
		
		
	}
}