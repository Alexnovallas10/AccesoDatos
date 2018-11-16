package P05_FicherosXML;


import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

	public class Convertir_xml_Html  {
	 public static void main(String argv[]) throws IOException{ 
	  String hojaEstilo = "D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.xsl";
	  String datosCanciones = "D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.xml";
	  File pagHTML = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\canciones.html");
	  FileOutputStream os = new FileOutputStream(pagHTML); //crear fichero HTML
	  
	  Source estilos =new StreamSource(hojaEstilo); //fuente XSL
	  Source datos =new StreamSource(datosCanciones); //fuente XML
	  Result result = new StreamResult(os);         //resultado de la transformaci�n
	  
	  try{     
	   Transformer transformer =  
	               TransformerFactory.newInstance().newTransformer(estilos);   
	   transformer.transform(datos, result);	//obtiene el HTML
	  }
	  catch(Exception e){System.err.println("Error: "+e);}
	  
	  os.close();  //cerrar fichero 	
	 }
	}
