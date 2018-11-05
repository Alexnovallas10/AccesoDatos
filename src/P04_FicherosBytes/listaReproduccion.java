package P04_FicherosBytes;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class listaReproduccion{
	
	int id, anio;
	String titulo, artista, duracion;
	boolean bo;
	
	public listaReproduccion (int i, int an, String t, String art, String dur,  boolean b) {
		
		this.id=i;
		this.anio=an;
		this.titulo=t;
		this.artista=art;
		this.duracion=dur;
		this.bo=b;
	}
		
	public listaReproduccion () {
		
	}

	









	public boolean getD() {
		return bo;
	}
	public void setD(boolean d) {
		this.bo = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	public boolean Existeid(int existe_id) throws IOException {
		File f = new File("D:\\alex\\Acceso_a_datos\\AD_01_Ficheros\\listareproduccion.dat");
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		
		int posicion = 0;


		try {
			do {
				
				raf.seek(posicion);//nos sitia en el lugar determinado del fichiero para empezar a leer datos
				 
				id=raf.readInt();
				
				posicion+=69;


				if(existe_id==id){
					return true;
				}
				
				
				
				}while(raf.getFilePointer()!=raf.length());
				//donde esta apuntando el puntero, el length nos indica la cantidad de bytes que contiene

			
			raf.close();
		
	}catch (EOFException e) {
		System.out.println("");
	}
		
		
		
		
		return false;
		
		
	}

	
	
}
