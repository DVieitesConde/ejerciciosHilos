package ejercicio8;

public class Tuberia8 {
	static boolean ok=false;
	Tuberia8(){
		
	}
	
	public synchronized void Saludar(String nombre) {
		
		if(nombre.equalsIgnoreCase("Rey")) {
			System.out.println(nombre+": Buenos dias subditos");
			ok=true;
			notifyAll();
		}else {
			while(!ok) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(nombre+": Saludos su majestad");
		}
		
	}
	
}
