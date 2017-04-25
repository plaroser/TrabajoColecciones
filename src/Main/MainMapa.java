package Main;

import java.util.HashMap;
import java.util.Map;

import Models.Movil;

public class MainMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables para Metodos
		 
	        
	        
		 Map <Integer,Movil> mapa = new HashMap<Integer,Movil>();
		 	Movil movil1 = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
			Movil movil2 = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
			Movil movil3 = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
			Movil movil4 = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");
//añadimos los moviles al mapa
	        mapa.put(1,movil1);
	        mapa.put(2,movil2);
	        mapa.put(3,movil3);
	        mapa.put(4,movil4);
	        
	        
System.out.println(mapa.remove(3));//borra el movil con esa clave
System.out.println( mapa.get(4));//devuelve el movil con esa clave
System.out.println(mapa.containsKey(2));//devuelve true si el mapa contiene esa clave
System.out.println(mapa.values());//devuelve el mapa como una lista
System.out.println( mapa.size());//devuelve el tamao del mapa

        
	       
	        //mapa.clear();
	        
       
	}
	
	}


