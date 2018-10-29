package P05_FicherosXML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import P04_FicherosBytes.Persona;

public class GenerarCancion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.dat");
		f.createNewFile();
		
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream obout = new ObjectOutputStream(fileout);
		
		cancion c[] = new cancion[5];
		
		c[0] = new cancion(1,1997,"Buenos dias", "Juan", "180 segundos",false);	
		c[1] = new cancion(2,1995,"Buenas noches", "Pedro", "210 segundos",true);		
		c[2] = new cancion(3,2010,"Buenas tardes", "Lucas", "150 segundos",false);		
		c[3] = new cancion(4,2014,"hola que tal", "Luis", "120 segundos",true);		
		c[4] = new cancion(5,2017,"Bien", "Angel", "320 segundos",false);		

		
	


		for(int i=0;i<5;i++) {
			obout.writeObject(c[i]);
		
		}
		obout.close();

	}

}
