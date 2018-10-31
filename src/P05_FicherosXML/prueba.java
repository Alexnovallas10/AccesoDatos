package P05_FicherosXML;

import java.io.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;


public class prueba {		
	public static void main(String[] args)
              throws FileNotFoundException, IOException, SAXException{
		
	 XMLReader  procesadorXML = XMLReaderFactory.createXMLReader();
	 GestionContenido gestor= new GestionContenido();  
	 procesadorXML.setContentHandler(gestor);
 	 InputSource fileXML = new InputSource("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.xml");	    
       procesadorXML.parse(fileXML);        	      
	}
}

class GestionContenido extends DefaultHandler {	 
	   int contador = 0;

	    public GestionContenido() {
	        super();
	    }	    
	    public void startDocument() {
	        System.out.println("Comienzo del Documento XML");
	    }	    
	    public void endDocument() {
	        System.out.println("Final del Documento XML");
	        
	        System.out.println("Numero canciones Españolas: "+contador);

	        
	    }	 	    
	    public void startElement(String uri, String nombre,
	              String nombreC, Attributes atts) {
	        System.out.printf("\t Principio Elemento: %s %n",nombre);	 	        
	    } 	
	    public void endElement(String uri, String nombre, 
                          String nombreC) {
	        System.out.printf("\tFin Elemento: %s %n", nombre);
	    }	
	    public void characters(char[] ch, int inicio, int longitud) 
                                            throws SAXException {
		   String car=new String(ch, inicio, longitud);
           //quitar saltos de l�nea	
		   car = car.replaceAll("[\t\n]","");	   
		   System.out.printf ("\t Caracteres: %s %n", car);	
		   
		   if(car.equals("true")) { 
			   contador++;

		   }
		 
	    }	

}//fin GestionContenido
