package P04_FicherosBytes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Escritura_Lectura_movimientobancario {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\banco.dat");
		f.createNewFile();
		
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream obout = new ObjectOutputStream(fileout);
		
		movimiento_bancario m;
		
		String[] fechas = new String[5];
		String[] conceptos = new String[5];
		int[] cantidades = new int[5];
		boolean[] tipos = new boolean[5];
		int i = 0;
		String masOperaciones = "si";

		

		while(masOperaciones.equals("si")) {
			System.out.println("Introduce la fecha: ");	
			fechas[i]=teclado.nextLine();
			System.out.println("Introduce el concepto: ");	
			conceptos[i]=teclado.nextLine();
			System.out.println("Introduce la cantidad: ");	
			cantidades[i]=teclado.nextInt();
			System.out.println("Introduce el tipo: ");	
			tipos[i]=teclado.nextBoolean();
			masOperaciones = teclado.nextLine();
			System.out.println("¿Desea realizar mas opeaciones? ");	
			masOperaciones = teclado.nextLine();
			i++;

	
		}

		for(int b=0;b<=i-1;b++) {
			m = new movimiento_bancario(fechas[b], conceptos[b], cantidades[b], tipos[b]);
			obout.writeObject(m);
		
		}
		
		obout.close();
		
		

		FileInputStream filein = new FileInputStream(f);
		ObjectInputStream obin = new ObjectInputStream(filein);
		int cantidadtotal = 0;
		
		try {
			while(true) {
				 
				m=(movimiento_bancario)obin.readObject();
				System.out.println(m.getfecha()+m.getconcepto()+" Cantidad: "+m.getcantidad()+" Tipo: "+m.gettipo());	
				
				if(m.gettipo()) 
					cantidadtotal += m.getcantidad();
				else
					cantidadtotal -= m.getcantidad();
					
			}
			
		}catch(EOFException eo) {
			System.out.println("No se encuentra ningun movieminto mas");
		}
		System.out.println("Cantidad total: "+cantidadtotal);	

		filein.close();

	}

}
