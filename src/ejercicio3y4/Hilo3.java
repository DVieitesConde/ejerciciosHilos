package ejercicio3y4;

public class Hilo3 extends Thread{

	Tuberia t;
	Hilo3(Tuberia t){
		this.t=t;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			
			t.contar(this.getName());
			
		}
	}
}
