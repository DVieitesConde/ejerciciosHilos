package ejercicio_10;

public class Persona extends Thread{

	private String nombre;
	private Tuberia t;
	
	Persona(String nombre, Tuberia t){
		
		this.nombre=nombre;
		this.t=t;
		
	}
	
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
			    Thread.sleep((long)(Math.random() * 500));
				t.comer(nombre);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		}
		
	}
	
}
