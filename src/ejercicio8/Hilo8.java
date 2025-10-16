package ejercicio8;

public class Hilo8 extends Thread {
	String nombre;
	Tuberia8 t;
	public Hilo8(String nombre, Tuberia8 t) {
		
		this.nombre=nombre;
		this.t=t; 
	}
	
	public void run() {
		
		t.Saludar(nombre);
		
		}
}
