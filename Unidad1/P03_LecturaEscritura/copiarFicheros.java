package P03_LecturaEscritura;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copiarFicheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\f1.txt");
		f1.createNewFile();

		File f2 = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\f2.txt");
		f2.createNewFile();
		

		int i=0;
		String texto="";
		char caracter[];
		
		FileReader fic = new FileReader(f1);

		
		while((i=fic.read())!=-1) {
					texto=texto+(char)i;
				}
		fic.close();
		
		FileWriter fw = new FileWriter(f2);
		
		caracter = texto.toCharArray();
		
		for(int y = 0; y < caracter.length; y++){
			fw.write(caracter[y]);		
		}
		fw.close();


	}

}
