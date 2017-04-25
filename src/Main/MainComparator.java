package Main;

import java.util.TreeSet;

import Comparator.ComparadorMoviles;
import Models.Movil;

public class MainComparator {

	public static void main(String[] args) {
		Movil movil1 = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
		Movil movil2 = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3 = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
		Movil movil4 = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");

		// Crear el treeSet con el comparador en una clase
		TreeSet<Movil> ListaMoviles = new TreeSet<>(new ComparadorMoviles());
		ListaMoviles.add(movil1);
		ListaMoviles.add(movil2);
		ListaMoviles.add(movil3);
		ListaMoviles.add(movil4);

		// Crear el treeSet con el comparador en expresion landa
		TreeSet<Movil> ListaMovilesLanda = new TreeSet<>((Movil o1, Movil o2) -> {
			if ((o1.getPrecio() - o2.getPrecio()) == 0)
				return o1.getPrecio() - o2.getPrecio();
			else
				return o1.getModelo().compareTo(o2.getModelo());
		});
		
		for(Movil valor: ListaMoviles){
			System.out.println(valor);
		}

	}

}
