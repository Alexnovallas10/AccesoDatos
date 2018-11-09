package P06_JABX;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import P05_FicherosXML.cancion1;
 

public class ListaCancion_JABX{
 
    private static final String MIARCHIVO_XML = "D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\listacanciones.xml";
 
    public static void main(String[] args) throws JAXBException, IOException {
        //Se crea la lista de libros
        ArrayList<cancion> cancionLista = new ArrayList<cancion>();
 
        // Creamos dos libros y los añadimos

        cancion cancion1 = new cancion(1, 2010, "ola", "luis", "120", true);
        cancionLista.add(cancion1);
        cancion cancion2 = new cancion(2, 2015, "mares", "ana", "220", true);
        cancionLista.add(cancion2);

 
        // Se crea La libreria y se le asigna la lista de libros
        LibreriaCanciones milibreria = new LibreriaCanciones();
        
        //milibreria.setListaLibro(libroLista);
 
        // Creamos el contexto indicando la clase raíz
        JAXBContext context = JAXBContext.newInstance(LibreriaCanciones.class);
      
        //Creamos el Marshaller, convierte el java bean en una cadena XML
        Marshaller m = context.createMarshaller();
        
        //Formateamos el xml para que quede bien
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
        // Lo visualizamos con system out
        m.marshal(milibreria, System.out);
 
        // Escribimos en el archivo
        m.marshal(milibreria, new File(MIARCHIVO_XML));
 
        // Visualizamos ahora los datos del documento XML creado
        System.out.println("------------ Leo el XML ---------");
        
        //Se crea Unmarshaller en el cotexto de la clase Libreria
        Unmarshaller unmars = context.createUnmarshaller();
        
        //Utilizamos el método unmarshal, para obtener datos de un Reader
        LibreriaCanciones libreria2 = (LibreriaCanciones) unmars.unmarshal(new FileReader(MIARCHIVO_XML));
        
        //Recuperamos el array list y visualizamos
        
        System.out.println("Libros de la librería: ");
        
        ArrayList<cancion> lista = libreria2.getListaCanciones();
        for (cancion cancion : lista) {
            System.out.println("\tTítulo de la cancion: " + cancion.getTitulo() 
              + " , Artista: " + cancion.getArtista());
 
        }
        
 
 
    }
}