import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ExamenAD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		double a, b, c, d, e;
		
		System.out.println("¿Como quieres llamar al fichero?");
		nombre = teclado.nextLine();
		
		
		System.out.println(" 1 numero");
		a = teclado.nextInt();
		System.out.println(" 2 numero");
		b = teclado.nextInt();
		System.out.println(" 3 numero");
		c = teclado.nextInt();
		System.out.println(" 4 numero");
		d = teclado.nextInt();
		System.out.println(" 5 numero");
		e = teclado.nextInt();
		
		File f = new File("./"+nombre+".dat");
		f.createNewFile();
		
		RandomAccessFile raf = new RandomAccessFile (f, "rw");
		
		double [] numeros = new double[10];
		numeros[0]=a;
		numeros[1]=b;
		numeros[2]=c;
		numeros[3]=d;
		numeros[4]=e;
		
		
		double x = 11;
		double y = 12;
		
		long posicion = raf.length();		
		raf.seek(posicion);
		
		raf.writeDouble(x);	
		raf.writeDouble(y);	

		
		//Mostrar contenido
		
		int id, posicion1=0;
		char aux;
		
		try {
			do {
				//Nos situamos en un lugar determinado del fichero para empezar a leer desde allí
				raf.seek(posicion1);
				id=raf.readInt();				
				
				posicion1 += 8;
			
				
				a = raf.readDouble();
				b = raf.readDouble();
				c = raf.readDouble();
				d = raf.readDouble();
				e = raf.readDouble();

				
						
			}while(raf.getFilePointer()!=raf.length());
			
			
			raf.close();
		}catch (EOFException e1) {				
			
			System.out.println(" Numeros: "+numeros);
			
			System.out.printf("Se ha llegado al final del fichero");

		}


	}

}
