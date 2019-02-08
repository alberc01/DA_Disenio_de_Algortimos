package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Calendarios{
	private ArrayList<Conferencias> conferencias;
	public Calendarios() {
		this.conferencias= new ArrayList<Conferencias>();
	}
	public void addConf(Conferencias e) {
		this.conferencias.add(e);
	}
	public void lectura(Scanner sc) throws Exception {
		int num=0;
		num=Integer.parseInt(sc.next());
		int j=0;
		if(num==0)throw new Exception();
		else {
			while(j<num) {
				addConf(new Conferencias(sc.nextLong(),sc.nextLong()));
				j++;
			}
			oneCase();
		}
	}
	public void oneCase() {
		long sol=1;
//		Collections.sort(this.conferencias, new ComparatorCalendarios());
//		long limiteInf=this.conferencias.get(0).getInicio();
//		long limiteSup=this.conferencias.get(0).getFin();
//		for (int i = 1; i < this.conferencias.size(); i++) {
//			if(this.conferencias.get(i).getInicio() >= limiteSup){
//				limiteSup=this.conferencias.get(i).getFin();
//				limiteInf=this.conferencias.get(i).getInicio();
//			}
//			else {
//				sol++;
//				if(this.conferencias.get(i).getFin() < limiteSup)
//				limiteSup=this.conferencias.get(i).getFin();
//
//			}
//		}
		int i=0;
		int j=1;
		long limiteInf=this.conferencias.get(0).getInicio();
		long limiteSup=this.conferencias.get(0).getFin();
		while(i<=j) {
			if(limiteInf<= this.conferencias.get(j).getFin()) {
				j--;
			}
			
		}
		System.out.println(sol);

	}

}
