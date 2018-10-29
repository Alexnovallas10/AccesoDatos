package P05_FicherosXML;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import P04_FicherosBytes.Persona;

public class CrearCancionXML {
	
/**
 * 
 * @param args
 * @throws FileNotFoundException
 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File fichero = 
			new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.dat");
		
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream obin = new ObjectInputStream(filein);		
		
		int  id, anio, posicion=0; //para situarnos al principio del fichero        
		char titulo[] = new char[10], aux;
		char artista[] = new char[10];		
		char duracion[] = new char[10];

		cancion c;
		     
		// Instancia para construir el parser
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		
		try {
			   
		     DocumentBuilder builder = factory.newDocumentBuilder();
		     DOMImplementation implementation = builder.getDOMImplementation();
		     Document document
		     = implementation.createDocument(null, "canciones", null);
		     document.setXmlVersion("1.0"); 
		   
		 	
				try {
					while(true) {
						for(int i=0;i<5;i++) {
							c=(cancion)obin.readObject();
							
							if(id>0) {
								   
								 Element raiz = 
						                   document.createElement("cancion"); //nodo empleado
						         document.getDocumentElement().appendChild(raiz); 
						        
						         // ID                       
						         CrearElemento("id",Integer.toString(id), raiz, document); 
						         // Apellido
						         CrearElemento("año",Integer.toString(anio), raiz, document); 
						         // Dpto
						         CrearElemento("Titulo",c.getTitulo().trim(), raiz, document); 
						         // Salario
						         CrearElemento("Artista",c.getArtista().trim(), raiz, document); 

						         CrearElemento("Duracion",c.getDuracion().trim(), raiz, document); 

						                                                          
							 }
						}
					}
					
				}catch(EOFException eo) {
					System.out.println("");
				}
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
				
		     Source source = new DOMSource(document);
		     Result result
		     = new StreamResult(new java.io.File("canciones.xml"));        
		     Transformer transformer
		     = TransformerFactory.newInstance().newTransformer();
		     transformer.transform(source, result); 
		     // se transforma el documento al fichero
		    
		    // MOSTRAR EL DOCUMENTO POR CONSOLA
		    // Result console = new StreamResult(System.out);
		    // transformer.transform(source, console);	   
			   
		    }catch(Exception e){ System.err.println("Error: "+ e); }
		    
		    file.close();  //cerrar fichero 	
		 }

private static void CrearElemento(String string, String string2, Element raiz, Document document) {
	// TODO Auto-generated method stub
	
}

		

	}


