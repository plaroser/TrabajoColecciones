package Main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

import Models.Movil;

public class MainMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables para Metodos

		Map<Integer, Movil> mapa = new HashMap<Integer, Movil>();// lo ordena
																	// sin orden
		Movil movil1 = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
		Movil movil2 = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3 = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
		Movil movil4 = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");

		// añadimos los moviles al mapa
		mapa.put(1, movil1);
		mapa.put(2, movil2);
		mapa.put(3, movil3);
		mapa.put(4, movil4);

		System.out.println(mapa.remove(3));// borra el movil con esa clave
		System.out.println(mapa.get(4));// devuelve el movil con esa clave
		System.out.println(mapa.containsKey(2));// devuelve true si el mapa
												// contiene esa clave
		System.out.println(mapa.values());// devuelve el mapa como una lista
		System.out.println(mapa.size());// devuelve el tamao del mapa
		// mapa.clear();
		Map<Integer, Movil> treemap = new TreeMap<Integer, Movil>();// los
																	// ordena de
																	// menor a
																	// mayor
		treemap.put(1, movil1);
		treemap.put(3, movil2);
		treemap.put(2, movil3);
		treemap.put(4, movil4);

		System.out.println(treemap.remove(3));// borra el movil con esa clave
		System.out.println(treemap.get(4));// devuelve el movil con esa clave
		System.out.println(treemap.containsKey(2));// devuelve true si el mapa
													// contiene esa clave
		System.out.println(treemap.values());// devuelve el mapa como una lista
		System.out.println(treemap.size());// devuelve el tamao del mapa
		// treemap.clear();
		Map<Integer, Movil> linkedhashmap = new LinkedHashMap<Integer, Movil>();// los
																				// ordena
																				// por
																				// orden
																				// de
																				// introducción
		linkedhashmap.put(4, movil3);
		linkedhashmap.put(3, movil1);
		linkedhashmap.put(2, movil2);
		linkedhashmap.put(1, movil4);

		System.out.println(linkedhashmap.remove(3));// borra el movil con esa
													// clave
		System.out.println(linkedhashmap.get(4));// devuelve el movil con esa
													// clave
		System.out.println(linkedhashmap.containsKey(2));// devuelve true si el
															// mapa contiene esa
															// clave
		System.out.println(linkedhashmap.values());// devuelve el mapa como una
													// lista
		System.out.println(linkedhashmap.size());// devuelve el tamao del mapa
		// treemap.clear();

		Map<Integer, Movil> Weakhashmap = new WeakHashMap<Integer, Movil>();// al
																			// paso
																			// de
																			// un
																			// tiempo
																			// se
																			// borran
		Weakhashmap.put(4, movil3);
		Weakhashmap.put(3, movil1);
		Weakhashmap.put(2, movil2);
		Weakhashmap.put(1, movil4);

		System.out.println(Weakhashmap.remove(3));// borra el movil con esa
													// clave
		System.out.println(Weakhashmap.get(4));// devuelve el movil con esa
												// clave
		System.out.println(Weakhashmap.containsKey(2));// devuelve true si el
														// mapa contiene esa
														// clave
		System.out.println(Weakhashmap.keySet());// devuelve el mapa como una
													// lista
		System.out.println(Weakhashmap.size());// devuelve el tamao del mapa
		// treemap.clear();

	}

}
