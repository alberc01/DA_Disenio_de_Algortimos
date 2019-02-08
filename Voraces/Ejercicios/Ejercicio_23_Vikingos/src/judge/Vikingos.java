package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vikingos {
	private ArrayList<Integer> defensas;
	private ArrayList<Integer> armada;
	public Vikingos() {
		this.defensas= new ArrayList<Integer>();
		this.armada= new ArrayList<Integer>();
	}
	public void addciudad(int n) {
		this.defensas.add(n);
	}
	public void addpersona(int n) {
		this.armada.add(n);
	}
	public ArrayList<Integer> detdef() {
		// TODO Auto-generated method stub
		return this.defensas;
	}

	public ArrayList<Integer> getarm() {
		// TODO Auto-generated method stub
		return this.armada;
	}
	//	4
	//	40 20 80 30
	//	25 50 35 40
	public int lectura(Scanner sc) {
		int num=0;
		num=Integer.parseInt(sc.next());
		int i=0;
		int j=0;
		while(j<num) {
			addciudad(Integer.parseInt(sc.next()));
			j++;
		}
		while(i<num) {
			addpersona(Integer.parseInt(sc.next()));
			i++;
		}
		return oneCase(num);
	}
	public int oneCase(int num) {
		int sol=0;
		int i=0;
		int j=0;
		Collections.sort(this.armada);
		Collections.sort(this.defensas);
		while(j<num) {
			int ciudad=this.defensas.get(i);
			int vikingos=this.armada.get(j);
			if(ciudad<=vikingos) {
				sol++;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		return sol;

	}
}
