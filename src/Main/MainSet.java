package Main;


import java.util.HashSet;


import Models.Movil;

public class MainSet {

	public static void main(String[] args) {
		
		Movil movil1=new Movil("Iphone","7 plus","Oro",909,"A10");
		Movil movil2=new Movil("Samsung","S8 plus","Negro",909,"Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3=new Movil("Sony","Xperia A1 Ultra","Negro",456,"MediaTek Helio P20");
		Movil movil4=new Movil("Xiaomi","Mi 5s plus","Negro",410,"Qualcomm Snapdragon 821");

		HashSet<Movil> listaMovil=new HashSet<>();
		
		listaMovil.add(movil1);
		listaMovil.add(movil2);
		listaMovil.add(movil3);
		listaMovil.add(movil4);
	
	
		for(Movil i: listaMovil){
			System.out.println("["+i.getMarca()+", "+i.getModelo()+", "
					+i.getColor()+", "+i.getPrecio()+"€, "+i.getProcesador() +"]");
			
		}

	}

}
