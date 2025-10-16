package ejercicio_13;

public class Paso {

	boolean cruzando=false;
	boolean circulando=false;
	Paso(){
		
	}
	
	public synchronized void circular(String nombre) {
		
		while(cruzando || circulando){

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		circulando=true;
		System.out.println(nombre+" esta circulando por el cruce");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		circulando=false;
		System.out.println(nombre+" paso por el cruce");
		notifyAll();
		
	}
	
	public synchronized void cruzar(String nombre) {
		
		while(circulando) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		cruzando=true;
		System.out.println(nombre+" esta cruzando");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cruzando=false;
		System.out.println(nombre+" ha cruzado");
		notifyAll();
		
	}
	
}
