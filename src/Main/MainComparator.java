package Main;

import java.util.TreeSet;

import Comparator.ComparadorMoviles;
import Comparator.CreadorMoviles;
import Models.Movil;

public class MainComparator {

	public static void main(String[] args) {

		// Crear el treeSet con el comparador en una clase
		TreeSet<Movil> ListaMoviles = new TreeSet<>(new ComparadorMoviles());
		
		//Rellenar lista
		for(Movil valor: CreadorMoviles.getListaMoviles()){
			ListaMoviles.add(valor);
		}

		// Crear el treeSet con el comparador en expresion landa
		TreeSet<Movil> ListaMovilesLanda = new TreeSet<>((Movil o1, Movil o2) -> {
			if ((o1.getPrecio() - o2.getPrecio()) != 0)
				return o1.getPrecio() - o2.getPrecio();
			else
				return o1.getModelo().compareTo(o2.getModelo());
		});
		
		//Rellenar lista
		for(Movil valor: CreadorMoviles.getListaMoviles()){
			ListaMovilesLanda.add(valor);
		}
		//Imprimir por pantalla
		for(Movil valor: ListaMoviles){
			System.out.println(valor);
		}

	}

}
