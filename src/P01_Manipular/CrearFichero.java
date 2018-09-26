package P01_Manipular;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileWriter f1 = new FileWriter("C:\\Users\\ifc\\Documents\\f1.txt");
		
		String dir = "C:\\Users\\ifc\\Documents";
		
		FileWriter f2 = new FileWriter(dir);

	
		}catch(IOException ex){
			System.out.println("error al acceder al fichero");
			}
		
	}

}
