package ejercicio5;

public class Hilo5 extends Thread{
	String nombre="";
	Tuberia5 t;
	Hilo5(Tuberia5 t, String nombre){
		
		this.nombre=nombre;
		this.t=t;
	}
	public synchronized void run() {

		for(int i=0;i<26;i++) {
			
			System.out.println(nombre+" lleva " + i + " metros");
			if(i==25) {
				t.meta(nombre);
			}
		}
		
	}

	
}
