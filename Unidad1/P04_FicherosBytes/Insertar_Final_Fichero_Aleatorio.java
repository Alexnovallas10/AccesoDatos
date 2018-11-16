package P04_FicherosBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Insertar_Final_Fichero_Aleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficherosAleatorios.dat");

		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		long posicion=raf.length();
		
		
		int id = 11;
		String apellidos = "Lopex";
		int dpto = 15;
		double salario = 1200;
		
		StringBuffer sbuf = null;

		
		raf.writeInt(id);
		
		sbuf = new StringBuffer(apellidos);
		sbuf.setLength(10);
		raf.writeChars(sbuf.toString());
		raf.writeInt(dpto);
		raf.writeDouble(salario);
	}

	
}
