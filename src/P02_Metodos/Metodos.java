package P02_Metodos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ficheroPrueba.txt";
		
		File f1 = new File(path);
		
		if (f1.exists()){
			//mostar nombre del fichero
			System.out.println(f1.getName());
			//mostrat ruta del archivo
			System.out.println(f1.getPath());
			//mostrar ruta absoluta del fichero
			System.out.println(f1.getAbsolutePath());
			//mostrat si existe el fichero
			System.out.println(f1.exists());
			//mostrar si es file el fichero
			System.out.println(f1.isFile());
			//mostrar si el fichero es un directorio o un fichero
			System.out.println(f1.isDirectory());
			//mostrar el tamaño del fichero(lo que ocupa)
			System.out.println(f1.length());
			//mostrar el directorio(carpeta) padre en la que se encuantra el fichero
			System.out.println(f1.getParent());
			//crear un fichero
			//f1.createnewFile();
			
			System.out.println("\n");

			
			
			//Mostrar nombre de los ficheros y directorios contenidos en el directorio actual y indicar si es fichero o directorio
			String dir="D:\\alex";
			File f2 = new File(dir);
			String[] listaNombres = f2.list();
		
			for( int i = 0; i < listaNombres.length;i++) {
				File f3 = new File(f2,listaNombres[i]);
				if(f3.isFile()) {
					System.out.println("Es un fichero");
				}else {
					System.out.println("Es un directorio");

				}
				
				
				System.out.println(listaNombres[i]);
				
			}
			
			
			
			//Diferenciar si es fichero o directorio
			System.out.println("\n");
			for( int i = 0; i < listaNombres.length;i++) {
				File f3 = new File(f2,listaNombres[i]);
				
				System.out.println(listaNombres[i]+" ¿Es fichero? "+ f3.isFile()+" ¿Es directorio? "+f3.isDirectory());
				
			}
			
			
			
			//realizar lo mismo, pero utilizando listFiles(File[]), en vez de list(String[])
			System.out.println("\n");
			File[] listaFicheros = f2.listFiles();
			for( int i = 0; i < listaFicheros.length;i++) {
				
				System.out.println(listaFicheros[i].getName()+" ¿Es fichero? "+ listaFicheros[i].isFile()+" ¿Es directorio? "+listaFicheros[i].isDirectory());
				
			}
			
			
			
			///crear un directorio
			File f = new File("D:\\alex\\Prueba");
			//si el directorio existe no hace nada
			if(f.mkdir()) {
				System.out.println("El directorio se ha creado");
			}else {
				System.out.println("El directorio no se ha creado"); 
			}
		
			
			//crear un directorio y crear en el 4 archivos sheldon.txt penny.txt leonard.txt howard.txt
			File f5 = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\TBBT");
			f5.mkdir();
			File f6 = new File(f5,"sheldon.txt");
			File f7 = new File(f5,"penny.txt");
			File f8 = new File(f5,"leonard.txt");
			File f9 = new File(f5,"howard.txt");

			try {
				
				f6.createNewFile();
				f7.createNewFile();
				f8.createNewFile();
				f9.createNewFile();
			
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			//renombrar un fichero 
			
			
			
			
			
			

		}else {
			System.out.println("La ruta al fichero es invalida");
		}
	
	}

}
