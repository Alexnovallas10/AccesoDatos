package P04_FicherosBytes;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Leer_Fichero_Aleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficherosAleatorios.dat");

		RandomAccessFile raf = new RandomAccessFile(f, "r");

		
		int id;
		int posicion = 0;
		char[] apellidos = new char[10];
		char aux;
		String apellido;
		int dpto;
		double salario;

		try {
			do {
				
				raf.seek(posicion);//nos sitia en el lugar determinado del fichiero para empezar a leer datos
				 
				id=raf.readInt();

				
				for(int i=0; i<apellidos.length; i++) {
					aux=raf.readChar();
					apellidos[i]=aux;
				}
				
				apellido = new String(apellidos);
				
				dpto=raf.readInt();
				
				salario=raf.readDouble();

				System.out.println("Id: "+id+" Apellido: "+apellido+" Departamento: "+dpto+" Salario: "+salario);

				posicion+=36;
				
				}while(raf.getFilePointer()!=raf.length());
				//donde esta apuntando el puntero, el length nos indica la cantidad de bytes que contiene

			
			raf.close();
		
	}catch (EOFException e) {
		System.out.println("Se ha llegado al final del fichero");
	}

}
	
}
