package P03_LecturaEscritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirLinea {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		
		File escribir = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\EscribirLinea.txt");
		
		FileWriter fw = new FileWriter(escribir);

		BufferedWriter bw = new BufferedWriter(fw);
		
		int Lineas =10;
		
		for(int i=0; i<Lineas; i++) {
			bw.write("Fila numero: "+i);
			bw.newLine();	
		}
		bw.close();
	}catch (FileNotFoundException fn) {
		System.out.println("El fichero no se encuentra...");
	}
	
	catch (IOException io) {
		System.out.println("Error de E/S");
	}

	}

}
