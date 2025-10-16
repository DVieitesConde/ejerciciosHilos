package ejercicio_11;

public class Semaforo extends Thread{

	private String color;
	private Tuberia t;
	
	Semaforo(String color, Tuberia t){
		this.color=color;
		this.t=t;
	}
	
	public void run(){
		
		for(int i=0;i<=10;i++) {
			t.cambiar(color);
		}
		
	}
}
