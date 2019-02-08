package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Broncos {
	private ArrayList<Integer> favor;
	private ArrayList<Integer> rivales;
	public Broncos() {
		this.favor= new ArrayList<Integer>();
		this.rivales= new ArrayList<Integer>();
	}
	public void addFavor(int n) {
		this.favor.add(n);
	}
	public void addContra(int n) {
		this.rivales.add(n);
	}
	public ArrayList<Integer> detdef() {
		// TODO Auto-generated method stub
		return this.favor;
	}

	public ArrayList<Integer> getarm() {
		// TODO Auto-generated method stub
		return this.rivales;
	}
	//	4
	//	40 20 80 30
	//	25 50 35 40
	public int lectura(Scanner sc) throws Exception {
		int num=0;
		num=Integer.parseInt(sc.next());
		int i=0;
		int j=0;
		if(num==0)throw new Exception();
		while(i<num) {
			addContra(Integer.parseInt(sc.next()));
			i++;
		}
		while(j<num) {
			addFavor(Integer.parseInt(sc.next()));
			j++;
		}
		return oneCase(num);
	}
	public int oneCase(int num) {
		int sol=0;
		int i=0;
		Collections.sort(this.favor,Collections.reverseOrder());
		Collections.sort(this.rivales);
		while(i<num) {
			int favor=this.favor.get(i);
			int contra=this.rivales.get(i);
			if(favor>contra) {
				sol+=favor-contra;
			}
			i++;

		}
		return sol;

	}
}
