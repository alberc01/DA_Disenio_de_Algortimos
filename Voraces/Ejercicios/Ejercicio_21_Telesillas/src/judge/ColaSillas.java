package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColaSillas {
	private ArrayList<Integer> colaSillas;
	public ColaSillas() {
		this.colaSillas= new ArrayList<Integer>();
	}

	public void persona(int n) {
		this.colaSillas.add(n);
	}
	public int lectura(Scanner sc) {

		int pesoMax=Integer.parseInt(sc.next());
		int tam=Integer.parseInt(sc.next());
		int i=0;
		while(i<tam) {
			persona(Integer.parseInt(sc.next()));
			i++;
		}
		Collections.sort(this.colaSillas);
		return oneCase(pesoMax);
	}

	private int oneCase(int pesoMax) {
		int sol=0;
		int i=0;
		int j=this.colaSillas.size()-1;
		while(i<=j) {	
			if(this.colaSillas.get(j)>=pesoMax || i==j) {
				j--;
				sol++;
			}
			else {
				if(this.colaSillas.get(j)+this.colaSillas.get(i)<=pesoMax) {
					j--;
					i++;
					sol++;
				}
				else {
					j--;
					sol++;
				}
			}	
		}
	return sol;
}

}
