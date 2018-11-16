package P05_FicherosXML;

import java.io.*;
import com.thoughtworks.xstream.XStream;

public class EscribirCancion {

	public static void main(String[] args)
	          throws IOException, ClassNotFoundException {   	
	    
			File fichero = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.dat");
	   		FileInputStream filein = new 
	               FileInputStream(fichero);//flujo de entrada   
	    
			//conecta el flujo de bytes al flujo de datos
	    	ObjectInputStream dataIS = new ObjectInputStream(filein);      
	    
			System.out.println
	           ("Comienza el proceso de creaci�n del fichero a XML ...");
					
	    //Creamos un objeto Lista de Canciones
	    listaCancion listacan = new listaCancion();	 
	     
	    try {
	      while (true) { //lectura del fichero
	          //leer una Persona
		    cancion1 Cancion= (cancion1) dataIS.readObject();    
		    listacan.add(Cancion); //a�adir cancion a la lista  
	      }	
	    }catch (EOFException eo) {}
	    
	    dataIS.close();  //cerrar stream de entrada     
	    
	    try {
			XStream xstream = new XStream();   
			//cambiar de nombre a las etiquetas XML
			xstream.alias("ListaDeCanciones", 
	                                           listaCancion.class);	
			//xstream.alias("DatosPersona", cancion.class);
			
			//xstream.aliasField("Nombre alumno", cancion.class, "nombre");
			//xstream.aliasField("Edad alumno", cancion.class, "edad");
			
			//quitar etiqueta lista (atributo de la claseListaPersonas)
			//xstream.addImplicitCollection
	           //               (ListaPersonas.class, "lista");
			//Insertar los objetos en el XML
		      xstream.toXML(listacan, new
	                          FileOutputStream("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ListaCanciones.xml"));	
			System.out.println("Creado fichero XML....");
		
	     }catch (Exception e) 
		   {e.printStackTrace();}	    
	  } // fin main
	

}
