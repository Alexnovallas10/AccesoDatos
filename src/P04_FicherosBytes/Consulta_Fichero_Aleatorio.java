package P04_FicherosBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Consulta_Fichero_Aleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficherosAleatorios.dat");

		RandomAccessFile raf = new RandomAccessFile(f, "r");
		
		Scanner teclado = new Scanner(System.in);

		int id;
		System.out.print("Introduzca un número de Id: ");
		id = teclado.nextInt();
		
		
		int posicion = (id-1)*36;//restamos una para empezar a leer la siguiente posicion
		
		
		char[] apellidos = new char[10];
		char aux;
		String apellido;
		int dpto;
		double salario;
		
		raf.seek(posicion);

		id=raf.readInt();

		
		for(int i=0; i<apellidos.length; i++) {
			aux=raf.readChar();
			apellidos[i]=aux;
		}
		
		apellido = new String(apellidos);
		
		dpto=raf.readInt();
		
		salario=raf.readDouble();

		System.out.println("Id: "+id+" Apellido: "+apellido+" Departamento: "+dpto+" Salario: "+salario);

		raf.close();
	}

}
