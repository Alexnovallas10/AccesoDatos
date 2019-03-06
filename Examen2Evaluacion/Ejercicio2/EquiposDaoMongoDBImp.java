package Ejercicio2;


import java.util.List;

import driverMongoDB.MongoDBConnection;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import com.mongodb.MongoClient;
import com.mongodb.client.*;


import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;

import idaos.EquiposDao;
import idaos.JugadorDao;
import modelos.Equipos;
import modelos.Jugador;

public class EquiposDaoMongoDBImp implements EquiposDao {

	@Override
	public boolean create(Equipo equipo) {
		
		boolean created = false;
		
		try {			
			
			MongoDBConnection mdbc = new MongoDBConnection();
			MongoDBConnection coleccion= mdbc.getCollection("equipos");
			
			Document doc = new Document();
			
			doc.append("Nombre", equipo.getNombre());
			doc.append("Copas",equipo.getCopas());
			doc.append("Años en primera",equipo.getEnprimera());
			doc.append("Año fundacion", equipo.getFundacion());
			doc.append("numero de ligas", equipo.getLigas());

	
			coleccion.insertOne(doc);
			created = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return created;
	}

	@Override
	public List<Equipo> read() {
		
		MongoDBConnection mdbc = new MongoDBConnection();
		MongoCollection coleccion= mdbc.getCollection("equipos");
		MongoCursor<Document> cursor = coleccion.find().iterator();
		
		List<Equipo> listaEquipos= new ArrayList<Equipo>();
		
		try {
		    while (cursor.hasNext()) {   
		    	
		        Document dbObj = cursor.next();
		        
		        String nombre = dbObj.getString("Nombre");
		        int ligas = dbObj.getString("ligas");
		        int copas = dbObj.getString("Copas");
		        int fundacion = dbObj.getString("fundacion");
		        int enprimera = dbObj.getString("enrpimera");


		        Equipo e = new Equipo(nombre, ligas, copas, fundacion, enprimera);
		        
		        listaEquipos.add(e);
		    }
		} finally {
		    cursor.close();
		}
		
		return listaEquipos;
	}

	@Override
	public boolean update(Equipo equipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Equipo equipo) {
		// TODO Auto-generated method stub
		return false;
	}

}