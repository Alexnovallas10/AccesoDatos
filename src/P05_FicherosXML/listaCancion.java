package P05_FicherosXML;

import java.util.ArrayList;
import java.util.List;

public class listaCancion {
	
    private List<cancion1> lista = new ArrayList<cancion1>();
    
    public listaCancion(){    	
    }

    public void add(cancion1 c) {
            lista.add(c);
    }
   
   public List<cancion1> getListaCanciones() {
            return lista;
    }


}