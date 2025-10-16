package ejercicio_10;

public class Tuberia {

	private int n=0;

	
	Tuberia(){
		
	}
	
	public synchronized void comer(String nombre) {

		if(n!=2) {
			n++;
			System.out.println(nombre+" ha comido");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			n=0;
			System.out.println(nombre+" ha comido");
			notifyAll();
		}
		
	}
	
}
