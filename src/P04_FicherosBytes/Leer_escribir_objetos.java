package P04_FicherosBytes;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Leer_escribir_objetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\persona.dat");
		f.createNewFile();
		
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream obout = new ObjectOutputStream(fileout);
		
		Persona p1;
		
		String[] nombres = new String[10];
		nombres[0]="Pepe";
		nombres[1]="Juan";
		nombres[2]="Jorge";
		nombres[3]="Luis";
		nombres[4]="Fran";
		nombres[5]="Pedro";
		nombres[6]="Javier";
		nombres[7]="Ana";
		nombres[8]="Lucia";
		nombres[9]="Bea";

		int[] edades = new int[10];
		edades[0]=19;
		edades[1]=18;
		edades[2]=17;
		edades[3]=21;
		edades[4]=22;
		edades[5]=25;
		edades[6]=26;
		edades[7]=15;
		edades[8]=19;
		edades[9]=17;
		
		int i;
		
		for(i=0;i<10;i++) {
			p1 = new Persona(edades[i], nombres[i]);
			obout.writeObject(p1);
		
		}
		obout.close();
		
		
		FileInputStream filein = new FileInputStream(f);
		ObjectInputStream obin = new ObjectInputStream(filein);
		
		
		int e;
		
		
		try {
			while(true) {
				for(i=0;i<10;i++) {
				p1=(Persona)obin.readObject();
				System.out.println("Persona "+(i+1)+p1.getnombre()+p1.getedad());	
				}
			}
			
		}catch(EOFException eo) {
			System.out.println("");
		}
		
		
	}

}
