package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import Models.*;

public class MainLista {

	public static void main(String[] args) {
		List<Movil> ListaMovil = new ArrayList<Movil>();

		Movil movil1 = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
		Movil movil2 = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3 = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
		Movil movil4 = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");

		ListaMovil.add(movil1);
		ListaMovil.add(movil2);
		ListaMovil.add(movil3);
		ListaMovil.add(movil4);

		for (Movil i : ListaMovil) {
			System.out.println(i);
		}
		
		if(ListaMovil.contains(movil3)){
			System.out.println(movil3);
		}
		
		if(ListaMovil.isEmpty()){
			System.out.println("La Lista de Moviles esta vacio");
		}
		else {
			System.out.println("La Lista de Moviles no esta vacia");
		}
		
		System.out.println(ListaMovil.size());

		Collection<Movil> MovilColl;
		
		// ITERATOR
		ListIterator<Movil> MovilIterator = ListaMovil.listIterator();
		System.out.println();
		
		while (MovilIterator.hasNext()) {
			System.out.println(MovilIterator.next());
		}
		
		// LINKEDLIST
		LinkedList<Movil> MovilLinked = new LinkedList<Movil>();
		for(Movil i: ListaMovil){
		MovilLinked.add(new Movil(i.getMarca(),i.getModelo(),i.getColor(),i.getPrecio(),i.getProcesador()));
		}
		
		System.out.println("Se elimina el primer objeto de la lista ");
		MovilLinked.removeFirst();
		for(Movil i : MovilLinked){
			System.out.println(i);
		}
		System.out.println("Añadimos el elemento que hemos borrado anteriormente");
		MovilLinked.addFirst(movil1);
		System.out.println(movil1);
		
		System.out.println("Imprimimos el primer objeto: ");
		System.out.println(MovilLinked.getFirst());
		System.out.println("Imprimimos el ultimo:");
		System.out.println(MovilLinked.getLast());
		
	}

}
