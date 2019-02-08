package judge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compra{
	private int compraTotal;
	private ArrayList<Integer> listaCompra= new ArrayList<Integer>();

	public Compra() {
		this.compraTotal=0;
	}
	public int getCompraTotal() {
		return compraTotal;
	}
	public ArrayList<Integer> geList() {
		return this.listaCompra;
	}
	public void addToCompraTotal(int libro) {
		this.listaCompra.add(libro);
		this.compraTotal += libro;
	}
	public void SortLis() {
		Collections.sort(this.listaCompra,Collections.reverseOrder());
	}
	public int Solucion(ArrayList<Integer> listaCompra) {
		int sol=0;
		for (int i = 1; i < listaCompra.size()+1; i++) {
			if(i%3 ==0 ) {
				sol+=listaCompra.get(i-1);
			}
		}
		return sol ;
	}
	public void readlist(Scanner sc) {
		int numCasos;
		int i=0;
		numCasos = Integer.parseInt(sc.next());
		while(i<numCasos) {
			addToCompraTotal(sc.nextInt());
			i++;
		}
		SortLis();
		System.out.println(Solucion(geList()));
	}

}
