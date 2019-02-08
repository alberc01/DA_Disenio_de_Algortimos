package Ejercicio_27;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCometas {
	ArrayList<Cuerdas> cuerdas;
	private int tam;
	private int LongMax;
	private int minimo;
	static long INF= (long) (Math.pow(2,62)-1);
	public ListaCometas() {
		this.cuerdas=new ArrayList<Cuerdas>();
		this.tam=0;
		this.LongMax=0;
	}

	void read(Scanner sc) {
		this.tam=Integer.parseInt(sc.next());
		this.LongMax=Integer.parseInt(sc.next());
		Cuerdas c=new Cuerdas( Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		cuerdas.add(0, c);	
		minimo=c.getCoste();
		for (int i = 1; i < this.tam; i++) {
			c=new Cuerdas( Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
			cuerdas.add(i, c);	
			if(c.getCoste()<minimo) {
				minimo=c.getCoste();
			}

		}
		cometas(this.cuerdas,this.LongMax);
	}
	void casosbase(long mat[][],int fin) {
		for (int j2 = 0; j2 < fin; j2++) {
			mat[this.tam][j2]=INF;
		}
	}
	void casosbase2(long mat[][],int fin) {
		for (int j2 = 0; j2 < fin; j2++) {
			mat[j2][0]=0;
		}
	}
	void incializaSelec(long[][] sele, int fin) {
		// TODO Auto-generated method stub
		for (int j2 = 0; j2 < fin; j2++) {
			sele[this.tam][j2]=1;
		}

	}
	void incializaSelec2(long[][] sele, int fin) {
		for (int j2 = 0; j2 < fin; j2++) {
			sele[j2][0]=0;
		}
	}
	void cometas(ArrayList<Cuerdas> c, int longitud) {
		long mat[][]=new long [c.size()+1][longitud+1];
		long cuerdas[][]=new long [c.size()+1][longitud+1];
		long seleccionados[][]=new long[c.size()+1][longitud+1];
		casosbase(cuerdas,longitud+1);
		casosbase2(cuerdas,c.size()+1);
		incializaSelec(seleccionados,longitud+1);
		incializaSelec2(seleccionados,c.size()+1);
		casosbase(mat, longitud+1);
		casosbase2(mat, c.size()+1);
		for (int i = c.size()-1; i >= 0; i--) {
			for (int j = 1; j <= longitud; j++) {
				if(j < c.get(i).getLongitud())  {
					mat[i][j]=mat[i+1][j];
					seleccionados[i][j]=seleccionados[i+1][j];
					cuerdas[i][j]=cuerdas[i+1][j];
				}
				else{
					mat[i][j]= Math.min(mat[(i+1)][(j-c.get(i).getLongitud())]+c.get(i).getCoste(),mat[i+1][j]);//minimo coste
					seleccionados[i][j]= seleccionados[(i+1)][(j-c.get(i).getLongitud())]+seleccionados[i+1][j];//cantidad de soluciones
					cuerdas[i][j]=Math.min(cuerdas[(i+1)][(j-c.get(i).getLongitud())]+1,cuerdas[i+1][j]);//minimas cuerdas
				}
			}
		}
		solucion(mat,c,cuerdas,seleccionados,c.size(),longitud);
	}


	void solucion(long mat[][],ArrayList<Cuerdas> c,long cuerdas[][],long sele[][],int size,int longi) {
		if(mat[0][longi] < INF) {
			System.out.println("SI "+ sele[0][longi] +" "+ cuerdas[0][longi] +" "+ mat[0][longi]); 
		}
		else {
			System.out.println("NO");
		}

	}
}
