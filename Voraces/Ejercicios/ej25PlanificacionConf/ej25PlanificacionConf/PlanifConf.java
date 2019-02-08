package ej25PlanificacionConf;

//Agustín Jofre Millet 3ºD

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.PriorityQueue;



public class PlanifConf extends juezSolver{

	//El coste de este algoritmo es N * log(N), siendo N el numero de elementos.
	public static int minNumSalas(Vector<Conferencia> c){
		
		PriorityQueue<Integer> salaUsada = new PriorityQueue<Integer>();
		
		
		//ordenamos conferencia por hora de inicio de menos a mayor
		Collections.sort(c);
		
		//meto la primera sala la de hora de ini mas pequeña, por finalizacion
		salaUsada.add(c.elementAt(0).getFinal());
				
		
		for (int i = 1 ; i < c.size() ; i++){
			
			if(c.elementAt(i).getInicio() >= salaUsada.peek().intValue()){
				
				salaUsada.poll();
				
			}
			salaUsada.add(c.elementAt(i).getFinal());
			
		}
		
		return salaUsada.size();
	}
	
	public static boolean caseSolver(int n) {
		
		
		Vector<Conferencia> c = new Vector<Conferencia>();
		
		int horaInicio = 0;
		int horaFin = 0;	
		
		
		for (int i = 0 ; i < n; i++){
			Conferencia conferencia = new Conferencia();
			
			horaInicio = sc.nextInt();
			horaFin = sc.nextInt();

			conferencia.setInicio(horaInicio);
			conferencia.setFinal(horaFin);
			c.add(conferencia);
			//out.println(c.elementAt(i).getFinal());
		}
		out.println(minNumSalas(c));
	
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		DOMJUDGE = true;
				
		int numPelis = 0; // pelis que proyectan 
		
		if(!DOMJUDGE)
			in = new BufferedReader( new FileReader("casos.txt"));
		sc = new Scanner(in);
		
		numPelis = sc.nextInt();
		// para caracteres -> Character.getNumericValue
		while (numPelis != 0){
			caseSolver(numPelis);
			numPelis = sc.nextInt();
			
		}
	}

}
