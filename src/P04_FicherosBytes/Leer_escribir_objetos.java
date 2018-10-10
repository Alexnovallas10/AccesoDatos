package P04_FicherosBytes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Leer_escribir_objetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\persona.dat");
		f.createNewFile();
		
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream obout = new ObjectOutputStream(fileout);
		
		Persona p1;
		int i;
		
		String[] nombres = new String[5];
		int[] edades = new int[5];

		for(i=0;i<5;i++) {
			System.out.println("Introduce el nombre de la persona: ");	
			nombres[i]=teclado.next();
			System.out.println("Introduce la edad de la persona: ");	
			edades[i]=teclado.nextInt();
			
		}
		
		
		
		
		
	
		
		for(i=0;i<5;i++) {
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
