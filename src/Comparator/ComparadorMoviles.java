package Comparator;

import java.util.Comparator;

import Models.Movil;

public class ComparadorMoviles implements Comparator<Movil> {

	@Override
	public int compare(Movil o1, Movil o2) {
		if ((o1.getPrecio() - o2.getPrecio()) != 0)
			return o1.getPrecio() - o2.getPrecio();
		else
			return o1.getModelo().compareTo(o2.getModelo());
	}

}
