package Main;

import java.util.HashMap;
import java.util.Map;

import Models.Movil;

public class MainMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables para Metodos
		 
	        
	        
		 Map <Integer,Movil> mapa = new HashMap<Integer,Movil>();
	        Movil m1 = new Movil("color","algo","algo",40,"ds");
	        mapa.put(1,m1);
	        Movil m2= new Movil("color","algo","algo",40,"sdfa");
	        mapa.put(2,m2);
	        Movil m3 = new Movil("color","algo","algo",40,"sdafad");
	        mapa.put(3,m3);
	        Movil m4 = new Movil("co","ago","algo",20,"sdfa");
	        mapa.put(4,m4);
	        
	        
System.out.println(mapa.remove(3));//borra el movil con esa clave
System.out.println( mapa.get(4));//devuelve el movil con esa clave
System.out.println(mapa.containsKey(2));//devuelve true si el mapa contiene esa clave
System.out.println(mapa.values());//devuelve el mapa como una lista
System.out.println( mapa.size());//devuelve el tamao del mapa

        
	       
	        //mapa.clear();
	        
       
	}
	
	}


