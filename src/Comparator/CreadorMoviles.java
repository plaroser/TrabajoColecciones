package Comparator;

import Models.Movil;

public class CreadorMoviles {
	private static Movil[] listaMoviles;

	public static Movil[] getListaMoviles() {
		listaMoviles = new Movil[4];
		listaMoviles[0] = new Movil("Iphone", "7 plus", "Oro", 909, "A10");
		listaMoviles[1] = new Movil("Samsung", "S8 plus", "Negro", 909, "Exynos 8895 o Qualcomm Snapdragon 835 ");
		listaMoviles[2] = new Movil("Sony", "Xperia A1 Ultra", "Negro", 456, "MediaTek Helio P20");
		listaMoviles[3] = new Movil("Xiaomi", "Mi 5s plus", "Negro", 410, "Qualcomm Snapdragon 821");
		return listaMoviles;
	}

}
