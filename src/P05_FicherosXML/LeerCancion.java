package P05_FicherosXML;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;

public class LeerCancion {

	public static void main(String[] args) throws IOException, ClassNotFoundException {   	
		
	    XStream xstream = new XStream();
		
	    xstream.alias("ListaDeCanciones", listaCancion.class);		
	    //xstream.alias("DatosPersona", cancion.class);	
	    //xstream.addImplicitCollection(listaCancion.class, "lista");
		
	    listaCancion listadoTodas = (listaCancion) 
	         xstream.fromXML(new FileInputStream("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\ListaCanciones.xml"));			
	    System.out.println("Numero de Canciones: " + 
	         listadoTodas.getListaCanciones().size());
				       
	    List<cancion> ListaCancion = new ArrayList<cancion>();
		ListaCancion = listadoTodas.getListaCanciones();
				        
		
	    Iterator <cancion> iterador = ListaCancion.listIterator(); 
	    while( iterador.hasNext() ) {
		    cancion c = (cancion) iterador.next(); 
		    System.out.printf("ID: "+c.getId()+"Año: "+c.getAnio()+"Titulo: "+c.getTitulo()+" Artista: "+ c.getArtista()+"Duracion: "+c.getDuracion()+c.getD());
	                                 
	    }    
	    System.out.println("Fin de listado .....");
	 } //fin main
	
}
