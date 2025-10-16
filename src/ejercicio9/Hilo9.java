package ejercicio9;

public class Hilo9 extends Thread {
	String nombre;
	Tuberia9 t;
	public Hilo9(String nombre, Tuberia9 t) {
		
		this.nombre=nombre;
		this.t=t; 
	}
	
	public void run() {
		
		t.Saludar(nombre);
		
		}
}
