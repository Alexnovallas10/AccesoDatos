package P01_operaciones;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import jabxClasesC.*;
import jabxClasesC.Canciones.ListaCancion;


public class PrincipalCanciones {

	public static void main(String[] args)throws IOException, JAXBException {

		visualizarxml();
	
	}

	////////////////////////////////////////
	public static void visualizarxml() throws IOException, JAXBException {
 		System.out.println("------------------------------ ");
		System.out.println("-------VISUALIZAR XML--------- ");
		System.out.println("------------------------------ ");
		
			// JAXBContext jaxbContext = JAXBContext.newInstance("datosclases");
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
 			// Crear un objeto de tipo Unmarshaller para convertir datos XML en
			// un �rbol de objetos Java
			Unmarshaller u = jaxbContext.createUnmarshaller();
			
			// La clase JAXBElement representa a un elemento de un documento XML
			// en este caso a un elemento del documento ventasarticulos.xml
			
			Canciones Lista = (Canciones) u.unmarshal(new FileInputStream("./AD_02_MapearXml_Clase/canciones.xml"));
 			
			// Visualizo el documento
			
			Marshaller m = jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 			m.marshal(Lista, System.out);
 			
 			// Guardamos las canciones en la lista
 			
			List listaCanciones = new ArrayList();
			listaCanciones = Lista.getListaCancion();
 			System.out.println("---------------------------- ");
			System.out.println("---VISUALIZAR LOS OBJETOS--- ");
			System.out.println("---------------------------- ");
			
 			for (int i = 0; i < listaCanciones.size(); i++) {
 				Canciones.ListaCancion lr = (ListaCancion) listaCanciones.get(i);
				System.out.println("Canción: " + lr.getId() + " Año: " + lr.getAnio()
						+ " Título: " + lr.getTitulo() + " Artista: " + lr.getArtista()
						+ " Duración: " + lr.getDuracion() + "  Española: " + lr.isBo());
			}
	}
}