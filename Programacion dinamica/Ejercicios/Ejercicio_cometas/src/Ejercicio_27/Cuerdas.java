package Ejercicio_27;

public class Cuerdas {

	private int coste;
	private int longitud;
	public Cuerdas( int l,int c) {
		this.coste=c;
		this.longitud=l;
	}
	public int getCoste() {
		return coste;
	}
	public void setCoste(int coste) {
		this.coste = coste;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
