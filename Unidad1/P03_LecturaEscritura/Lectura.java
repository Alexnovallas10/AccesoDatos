package P03_LecturaEscritura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\fichero.txt");
				
		//flujo de entrada al fichero
		FileReader fic = new FileReader(f);
		int i; //caracter actual
			
			while((i=fic.read())!=-1) {
			System.out.print((char)i);		
				}
			
		fic.close();
		
		//lo mismso con un caracter
		
		 fic = new FileReader(f);

		
		char[] b= new char[30];
		
		while((i=fic.read(b))!=-1) {
			System.out.print(b);		
				}
		fic.close(); //cerrar fichero

			
			
	}
}