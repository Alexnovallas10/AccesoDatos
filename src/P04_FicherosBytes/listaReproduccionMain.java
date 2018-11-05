package P04_FicherosBytes;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class listaReproduccionMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int i = 5 ;
		
		System.out.println("1.- Generar fichero");
		System.out.println("2.- Insertar datos de la cancion");
		System.out.println("3.- Consultar datos de cancion");
		System.out.println("4.- Modificar año de la cancion");		
		System.out.println("5.- Borrar informacion");
		System.out.println("6.- Mostrar ID de canciones borradas");
	
		
		i =teclado.nextInt();
      	 
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\listareproduccion.dat");
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");

		int id, anio;
    	String titulo, artista, duracion;
    	boolean bo;
    	
		char[] titulos = new char[10];
		char[] artistas = new char[10];
		char[] duraciones = new char[5];
		
		long posicion = 0;
		char aux;

    	
    	listaReproduccion l = new listaReproduccion();
    	
        switch (i) {
            case 1:	f.createNewFile();
                     break;
            case 2:  
            	    
            	    
            	    System.out.println("Introduce el Id: ");
            	    id=teclado.nextInt();
            	    
            	    if(!l.Existeid(id)) {
            	    	
            	    System.out.println("Introduce el año: ");
            	    anio=teclado.nextInt();
            	    teclado.nextLine();
            	    System.out.println("Introduce el titulo: ");	
            	    titulo=teclado.nextLine();
            	    System.out.println("Introduce el artista: ");	            	    
            	    artista=teclado.nextLine();
            	    System.out.println("Introduce la duracion: ");
            	    duracion=teclado.nextLine();
            	    System.out.println("Introduce el origen de la cancion: ");
            	    bo=teclado.nextBoolean();
            	    
            	    l = new listaReproduccion(id, anio, titulo, artista, duracion, bo);

            	    posicion=raf.length();
            	    raf.seek(posicion);
            	  
            	    raf.writeInt(id);
            	    raf.writeInt(anio);

            		StringBuffer sbuf = null;
        			
        			sbuf = new StringBuffer(titulo);
        			sbuf.setLength(10);
        			raf.writeChars(sbuf.toString());
        			sbuf = new StringBuffer(artista);
        			sbuf.setLength(10);
        			raf.writeChars(sbuf.toString());
        			sbuf = new StringBuffer(duracion);
        			sbuf.setLength(10);
        			raf.writeChars(sbuf.toString());
        			raf.writeBoolean(bo);
            	    }else
            	    	System.out.println("El ID ya existe");
            	    
                     break;
            case 3:              	    
            	System.out.println("Introduce el id de la cancion: ");
            	id=teclado.nextInt();            	
        			        					
        		if(l.Existeid(id)) {
        				posicion=(id-1)*69;
        				raf.seek(posicion);//nos sitia en el lugar determinado del fichiero para empezar a leer datos 
        				id=raf.readInt();		
        				anio=raf.readInt();
        				
        				for(int b=0; b<titulos.length; b++) {
        					 aux = raf.readChar();
        					 titulos[b]=aux;
        				}
        				
        				titulo = new String(titulos);
        				
        				for(int b=0; b<artistas.length; b++) {
       					 aux = raf.readChar();
       					 artistas[b]=aux;
        					}
       				
        				artista = new String(artistas);
        				
        				for(int b=0; b<duraciones.length; b++) {
       					 aux = raf.readChar();
       					 duraciones[b]=aux;
        					}
       				
        				duracion = new String(duraciones);
        				
        				bo=raf.readBoolean();
        				
        				System.out.println("Id: "+id+" Año: "+anio+" Titulo: "+titulo+" Artista: "+artista+" Duracion:"+duracion);

        				
        					}

        			raf.close();
        
	
        	   
            	
            	
            	
            		break;
            case 4:  
            	System.out.println("Introduce el id de la cancion para cambiar su año: ");
            	id=teclado.nextInt();            	

            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            		break;
            case 5:  
                	break;
            case 6:
            		break;
            case 7:
            	
            	
        		break;
        		}

	}

}
