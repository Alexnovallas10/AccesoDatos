package P05_FicherosXML;

import java.util.ArrayList;
import java.util.List;

public class listaCancion {
	
    private List<cancion> lista = new ArrayList<cancion>();
    
    public listaCancion(){    	
    }

    public void add(cancion c) {
            lista.add(c);
    }
   
   public List<cancion> getListaCanciones() {
            return lista;
    }


}