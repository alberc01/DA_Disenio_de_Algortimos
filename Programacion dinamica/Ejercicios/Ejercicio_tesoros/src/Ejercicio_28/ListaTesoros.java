package Ejercicio_28;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTesoros {
	ArrayList<Tesoro> tesoros;
	private int tam;
	private int Botella;
	private int minimo;
	public ListaTesoros() {
		this.tesoros=new ArrayList<Tesoro>();
		this.tam=0;
		this.Botella=0;
	}

	void read(Scanner sc) {
		this.Botella=Integer.parseInt(sc.next());
		this.tam=Integer.parseInt(sc.next());
		for (long i = 0; i < tam; i++) {
			tesoros.add(new Tesoro(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
		}
		resolver(tesoros,this.Botella);
	}
	private void resolver(ArrayList<Tesoro> t, int botella) {
		long MT[][]= new long[t.size()+1][botella+1];
		boolean cogidos[]=new boolean[t.size()];
		long cantidad[][]=new long[t.size()+1][botella+1];
		long cant=0;
		for (int i = 1 ; i <= t.size(); i++) {
			for (int j = 1; j <= botella; j++) {
				int profundidadObj=(t.get(i-1).getCoste()*2) + (t.get(i-1).getCoste());
				if(j < profundidadObj) {
					MT[i][j]=MT[i-1][j];
					cantidad[i][j]=cantidad[i-1][j];
				}
				else {
					MT[i][j]=Math.max(MT[i-1][j],MT[i-1][j-profundidadObj]+t.get(i-1).getPrecio());
					if(MT[i-1][j-profundidadObj]+t.get(i-1).getPrecio()>MT[i-1][j])
						cantidad[i][j]=cantidad[i-1][j-profundidadObj]+1;
					else 
						cantidad[i][j]=cantidad[i-1][j];
				}
			}	
		}
		int j=this.Botella;
		if(MT[t.size()][botella]!=0) {
			System.out.println(MT[t.size()][botella]);
			System.out.println(cantidad[t.size()][botella]);
			for (int i = t.size();  i > 0 && MT[i][j]!=0 ; i--) {
				int profundidadObj=(t.get(i-1).getCoste()*2) + (t.get(i-1).getCoste());
				if(MT[i][j]==MT[i-1][j]) {
					cogidos[i-1]=false;
				}
				else {
					cogidos[i-1]=true;
					System.out.println(t.get(i-1).getCoste()+" "+t.get(i-1).getPrecio());
					j=j-profundidadObj;
				}
			}
			System.out.println("----");
		}
		else {
			System.out.println(MT[t.size()][botella]);
			System.out.println(cant);
			System.out.println("----");
			
		}
	}
}
