package ej25PlanificacionConf;



public class Conferencia implements Comparable<Conferencia>{
	private int inicio = 0;    
    private int fin = 0 ; 
   

	
	// accessor methods
    public int getInicio() { return inicio; }
    public int getFinal() { return fin; }

    
 // guardar methods
    public void setInicio(int inicio) { this.inicio = inicio; }
    public void setFinal(int fin) { this.fin = fin; }
	

	//ordenar por la finalizacion de la peli
	@Override
	public int compareTo(Conferencia a) {
		// TODO Auto-generated method stub
		int ini = a.getInicio();
		
		return (this.inicio - ini);
	}
	

}
