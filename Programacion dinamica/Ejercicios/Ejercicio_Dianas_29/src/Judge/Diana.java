package Judge;

import java.util.ArrayList;
import java.util.Scanner;

public class Diana {
	private ArrayList<Integer> diana;
	private int tam;
	private int PuntuacionMax;
	static long INF= (long) (Math.pow(2,62)-1);
	public Diana() {
		diana= new ArrayList<Integer>();
		tam=0;
	}
	public void read(Scanner sc) {
		this.PuntuacionMax= Integer.parseInt(sc.next());
		this.tam=Integer.parseInt(sc.next());;
		int i=0;
		while(i<tam) {
			diana.add(Integer.parseInt(sc.next()));
			i++;
		}
		minD();
	}
	void casoB1(long MD[][]) {
		for (int i = 0; i < tam+1; i++) {
			MD[i][0]=0;
		}

	}
	void casoB2(long MD[][]) {
		for (int i = 0; i < PuntuacionMax+1; i++) {
			MD[0][i]=INF;
		}

	}
	private void minD() {
		long MD[][]=new long [tam+1][PuntuacionMax+1];
		casoB2(MD);
		casoB1(MD);
		for (int i = 1; i <= tam; i++) {
			for (int j = 1; j <= PuntuacionMax; j++) {
				int puntuacionOBjetivo=diana.get(i-1)*(j/diana.get(i-1));
				if(j>=puntuacionOBjetivo) {
					long np=MD[i-1][j];
					long p=MD[i-1][j-puntuacionOBjetivo]+ (j/diana.get(i-1));
					MD[i][j]=Math.min(np,p);
				}
				else {
					MD[i][j]=MD[i-1][j];	
				}
			}
		}
		sol(MD);
	}
	private void sol(long[][] MD) {
		//System.out.println(MD[tam][PuntuacionMax]);
		int j=PuntuacionMax;
		if(MD[tam][PuntuacionMax]!=INF) {
			long nD=MD[tam][PuntuacionMax];
			System.out.println(nD+": ");
//			for (int i = tam; i>=0; i--) {
//				if(diana.get(i)*nD <PuntuacionMax) {
//					for (int k = 0; k < nD; k++) {
//						System.out.println(diana.get(i));
//					}
//				}
//			}
			System.out.println("prue");
		}
		else {
			System.out.println("Imposible");
		}
		
	}

}
