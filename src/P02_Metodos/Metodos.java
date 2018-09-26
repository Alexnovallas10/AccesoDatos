package P02_Metodos;

import java.io.FileWriter;
import java.io.IOException;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter f1 = new FileWriter("C:\\Users\\ifc\\Documents\\f1.txt");
			System.out.println(f1.getEncoding());

			f1.write("Que es el cipotegato");
			f1.close();

			}catch(IOException ex){
				System.out.println("error al acceder al fichero");
				}
		
	}

}
