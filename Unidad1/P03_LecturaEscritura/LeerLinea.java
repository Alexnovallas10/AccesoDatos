package P03_LecturaEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeerLinea {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File leer = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\leerLinea.txt");
		
		FileReader fr = new FileReader(leer);

		BufferedReader br = new BufferedReader(fr);
		
		String tmp;
		
		while((tmp=br.readLine())!=null){
			
			System.out.println(tmp);
		}
	
	}

}
