package P06_JABX;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//Esto significa que la clases "Libreria.java" es el elemento raiz
//namespace es opcional
//@XmlRootElement(namespace = "ejemplo1.xml")
//@XmlRootElement(namespace = "")
@XmlRootElement()
public class LibreriaCanciones {
	
    private ArrayList<cancion> lista = new ArrayList<cancion>();
    
    public LibreriaCanciones(){    	
    }

    public void add(cancion c) {
            lista.add(c);
    }
    
    @XmlElementWrapper(name = "ListaCanciones") // 
    @XmlElement(name = "cancion")
   public ArrayList<cancion> getListaCanciones() {
            return lista;
    }
   
   


}