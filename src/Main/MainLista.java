package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import Models.*;

public class MainLista {

	public static void main(String[] args) {
		List<Movil> ListaMovil = new ArrayList <Movil>();
		
		Movil movil1=new Movil("Iphone","7 plus","Oro",909,"A10");
		Movil movil2=new Movil("Samsung","S8 plus","Negro",909,"Exynos 8895 o Qualcomm Snapdragon 835 ");
		Movil movil3=new Movil("Sony","Xperia A1 Ultra","Negro",456,"MediaTek Helio P20");
		Movil movil4=new Movil("Xiaomi","Mi 5s plus","Negro",410,"Qualcomm Snapdragon 821");
		
		ListaMovil.add(movil1);
		ListaMovil.add(movil2);
		ListaMovil.add(movil3);
		ListaMovil.add(movil4);
		
		for(Movil i: ListaMovil){
		System.out.println(i);
		}
		
		
		
		Collection <Movil> MovilColl;
		
		ListIterator<Movil> MovilIterator = ListaMovil.listIterator();
		System.out.println();
		while(MovilIterator.hasNext()){
			if(MovilIterator == movil2){
			
				MovilIterator.remove();
			}
			System.out.println(MovilIterator.next());
		}
		
		
		
	}

}
