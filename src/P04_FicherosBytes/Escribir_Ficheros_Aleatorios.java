package P04_FicherosBytes;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Escribir_Ficheros_Aleatorios {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficherosAleatorios.dat");
		f.createNewFile();

		//el modo rw si no existe el fichero lo crea
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		StringBuffer sbuf = null;

		String[] apellidos = new String[10];
		apellidos[0]="Royo";
		apellidos[1]="Chueca";
		apellidos[2]="Bruna";
		apellidos[3]="Pascual";
		apellidos[4]="Moreno";
		apellidos[5]="Alonso";
		apellidos[6]="Lancia";
		apellidos[7]="Carcavilla";
		apellidos[8]="Sanchez";
		apellidos[9]="Navas";
		
		int[] dpto = new int[10];
		dpto[0]=19;
		dpto[1]=18;
		dpto[2]=17;
		dpto[3]=21;
		dpto[4]=22;
		dpto[5]=25;
		dpto[6]=26;
		dpto[7]=15;
		dpto[8]=19;
		dpto[9]=17;

		double[] salario = new double[10];
		salario[0]=1500;
		salario[1]=1800;
		salario[2]=1700;
		salario[3]=2100;
		salario[4]=2200;
		salario[5]=2500;
		salario[6]=2600;
		salario[7]=1500;
		salario[8]=1900;
		salario[9]=1700;
		
		
		for(int i=0;i<10;i++) {
			raf.writeInt(i+1);
			
			sbuf = new StringBuffer(apellidos[i]);
			sbuf.setLength(10);
			raf.writeChars(sbuf.toString());
			raf.writeInt(dpto[i]);
			raf.writeDouble(salario[i]);
			
		}



	}

}
