package Ejercicio_01_BDOO;



import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;


public class Principal {

	static ODB bd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			bd = ODBFactory.open("AD_04_BDOO\\Ejercicio_01_BDOO\\ARTICULOS.DAT");
			
			
			//---------------------------------MOSTRAR DATOS-------------------------
			// Genero un conjunto de objetos y los traigo del ODB conectado
			Objects<Ventas> objects=bd.getObjects(Ventas.class);

			// Imprimo cuantos objetos me he traido de la BD
			System.out.println(objects.size() + " Ventas:");

			int i = 1; // Meramente estético. Así muestra listados los objetos

			// Mientras haya objetos, los capturo y muestro
			while(objects.hasNext()){

			      // Creo un objeto Jugadores y almaceno ahí el objeto
				Ventas ven= objects.next();
			     
			      // Imprimo las propiedades que me interes de ese objeto
			      System.out.println((i++)  + ven.getCodventa() + ven.getCodarti().getCodarti() + " "+ ven.getCodarti().getDenom() + 
							"  Stock: " + ven.getCodarti().getStock() + "  Pvp: " + ven.getCodarti().getPvp() );
			} // Fin del While
			bd.close();

	}

}
