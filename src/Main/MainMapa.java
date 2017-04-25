package Main;

import java.util.HashMap;
import java.util.Map;

import Models.Movil;

public class MainMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map <Integer,Movil> mp = new HashMap<Integer,Movil>();
	        Movil p = new Movil("color","algo","algo",40,"ds");
	        mp.put(4,p);
	        Movil a = new Movil("color","algo","algo",40,"sdfa");
	        mp.put(1,a);
	        Movil e = new Movil("color","algo","algo",40,"sdafad");
	        mp.put(2,e);
	        Movil f = new Movil("co","ago","algo",20,"sdfa");
	        mp.put(3,f);
	        
	        System.out.println(mp.toString());
	        System.out.println(mp.put(3,f));
	}

}
