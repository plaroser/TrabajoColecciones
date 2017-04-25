package Main;

import java.util.HashSet;
import java.util.TreeSet;

import Models.Movil;

public class MainSet {

	public static void main(String[] args) {

		Movil movil1 = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
		Movil movil2 = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3 = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
		Movil movil4 = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");

		HashSet<Movil> listaMovil = new HashSet<>();
		TreeSet<Movil> listaMoviles = new TreeSet<>((Movil o1, Movil o2) -> {//Utilizamos expresion lambda para ahorrarnos crear una clase comparator
			if ((o1.getPrecio() - o2.getPrecio()) != 0)
				return o1.getPrecio() - o2.getPrecio();
			else
				return o1.getModelo().compareTo(o2.getModelo());
		});

		listaMovil.add(movil1);
		listaMovil.add(movil2);
		listaMovil.add(movil3);
		listaMovil.add(movil4);

		listaMoviles.add(movil1);
		listaMoviles.add(movil2);
		listaMoviles.add(movil3);
		listaMoviles.add(movil4);

		for (Movil i : listaMovil) {
			System.out.println(i);

		}

		System.out.println("");
		listaMovil.remove(movil1);
		listaMovil.remove(movil3);

		for (Movil i : listaMovil) {
			System.out.println(i);

		}

		System.out.println("");

		if (listaMovil.isEmpty()) {
			System.out.println("No hay moviles en este momento.");
		}

		else
			System.out.println("Estos son los moviles actules:");
		for (Movil i : listaMovil) {
			System.out.println(i);

		}

		System.out.println("");
		System.out.println("Mostramos el primer movil:"+listaMoviles.first());
		listaMoviles.first();

		System.out.println("Mostramos el ultimo movil:"+listaMoviles.last());
		

	}

}
