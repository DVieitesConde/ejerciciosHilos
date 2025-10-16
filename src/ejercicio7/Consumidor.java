package ejercicio7;

public class Consumidor extends Thread{
	
	Tuberia7 t;
	public Consumidor(Tuberia7 t) {
		this.t=t;
	}
	
	public void run() {
		char c;
		try {
			this.sleep(100);
	   }catch (InterruptedException e) {
		e.printStackTrace();
	}
		for(int i=0;i<10;i++){
			c=t.recoger();		
		}
	}
}
