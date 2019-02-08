package judge;

import java.util.ArrayList;
import java.util.Scanner;

public class Manguera {
	private ArrayList<Integer> manguera;
	public Manguera() {
		this.manguera= new ArrayList<Integer>();
	}

	public void agujero(int n) {
		this.manguera.add(n);
	}
	public int lectura(Scanner sc) {
		int tam=Integer.parseInt(sc.next());
		int Lparche=Integer.parseInt(sc.next());
		int i=0;
		while(i<tam) {
			agujero(Integer.parseInt(sc.next()));
			i++;
		}
		return oneCase(Lparche);
	}

	private int oneCase(int lparche) {
		int sol=1;
		int j=0;
		int distancia=0;
		for (int i = 1; i < this.manguera.size(); i++) {
			distancia=this.manguera.get(i)- this.manguera.get(j);
			if(distancia>lparche) {
				sol++;
				j=i;
			}
			
		}
		return sol;
	}

}
