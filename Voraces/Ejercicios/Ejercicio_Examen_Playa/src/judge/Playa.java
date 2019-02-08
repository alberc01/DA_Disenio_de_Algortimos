package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Playa{
	private ArrayList<Edificios> edificios;
	public Playa() {
		this.edificios= new ArrayList<Edificios>();
	}
	public void addedificio(Edificios e) {
		this.edificios.add(e);
	}
	//	4
	//	40 20 80 30
	//	25 50 35 40
	public int lectura(Scanner sc) {
		int num=0;
		num=Integer.parseInt(sc.next());
		int j=0;
		while(j<num) {
			addedificio(new Edificios(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
			j++;
		}

		return oneCase();
	}
//	public int oneCase() {
//		int sol=1;
//		Collections.sort(this.edificios, new comparatorEdif());
//		int limiteInf=this.edificios.get(0).getInicio();
//		int limiteSup=this.edificios.get(0).getFin();
//		for (int i = 1; i < this.edificios.size(); i++) {
////			limiteInf=this.edificios.get(i).getInicio();
//			if(limiteInf<this.edificios.get(i).getInicio() && this.edificios.get(i).getInicio() < limiteSup ) {
//				if(limiteSup>this.edificios.get(i).getFin())
//					limiteSup=this.edificios.get(i).getFin();
//			}
//			else {
//				sol++;
//				limiteSup=this.edificios.get(i).getFin();
//				limiteInf=this.edificios.get(i).getInicio();
//			}
//		}
//		return sol;
//
//	}
	public int oneCase() {
		int sol=1;
		Collections.sort(this.edificios, new comparatorEdif());
		int limiteInf=this.edificios.get(0).getInicio();
		int limiteSup=this.edificios.get(0).getFin();
		for (int i = 1; i < this.edificios.size(); i++) {
//			limiteInf=this.edificios.get(i).getInicio();
			if(this.edificios.get(i).getFin() <= limiteInf ){
				sol++;
				limiteSup=this.edificios.get(i).getFin();
				limiteInf=this.edificios.get(i).getInicio();	
			}
			else {
				if(limiteInf< this.edificios.get(i).getFin())
				limiteSup=this.edificios.get(i).getFin();
				if(limiteInf<this.edificios.get(i).getInicio())
				limiteInf=this.edificios.get(i).getInicio();	
			}
			
			
		}
		return sol;

	}

}
