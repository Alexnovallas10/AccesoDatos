package P05_FicherosXML;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;


public class CrearCancionXML {
	
/**
 * 
 * @param args
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fichero = 
			new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.dat");
		
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream obin = new ObjectInputStream(filein);		
		
		int  id = 0, anio = 0, posicion=0; //para situarnos al principio del fichero        
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
							
						if(c.getId()>0) {
								   
							Element raiz = 
						        document.createElement("cancion"); //nodo empleado
						        document.getDocumentElement().appendChild(raiz); 
						        
						         // ID                       
						    CrearElemento("id",Integer.toString(id), raiz, document); 
						    // Apellido
						    CrearElemento("anio",Integer.toString(anio), raiz, document); 
						         // Dpto
						    CrearElemento("titulo",c.getTitulo().trim(), raiz, document); 
						         // Salario
						    CrearElemento("artista",c.getArtista().trim(), raiz, document); 

						    CrearElemento("duracion",c.getDuracion().trim(), raiz, document); 
						         //origen
						    String bo= String.valueOf(c.getD());
						    CrearElemento("origen",bo.trim(), raiz, document); 
                                                 
							 }
						}
					}
					
				}catch(EOFException eo) {
					System.out.println("");
				}
		     

		     Source source = new DOMSource(document);
		     Result result
		     = new StreamResult(new java.io.File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.xml"));        
		     Transformer transformer
		     = TransformerFactory.newInstance().newTransformer();
		     transformer.transform(source, result); 
		     // se transforma el documento al fichero
		    
		    // MOSTRAR EL DOCUMENTO POR CONSOLA
		    Result console = new StreamResult(System.out);
		    transformer.transform(source, console);	   
			   
		    }catch(Exception e){ System.err.println("Error: "+ e); }
		    
		    
		 }

	static void  CrearElemento(String datoEmple, String valor,
            Element raiz, Document document){
		Element elem = document.createElement(datoEmple); 
		Text text = document.createTextNode(valor); //damos valor
		raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
		elem.appendChild(text); //pegamos el valor		 	
}
		

	}


