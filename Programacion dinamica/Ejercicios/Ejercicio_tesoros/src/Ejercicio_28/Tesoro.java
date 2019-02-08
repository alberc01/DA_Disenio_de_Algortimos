package Ejercicio_28;


public class Tesoro{

	private int profundidad;
	private int precio;
	public Tesoro( int p,int prec) {
		this.profundidad=p;
		this.precio=prec;
	}
	public int getCoste() {
		return profundidad;
	}
	public void setCoste(int coste) {
		this.profundidad = coste;
	}
	public int getPrecio() {
		return precio;
	}
	public void setLongitud(int longitud) {
		this.precio = longitud;
	}
}
