package ejercicio7;

public class Productor extends Thread{

	private String alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Tuberia7 t;
	
	public Productor(Tuberia7 t) {
		this.t=t;
	}
	
	public  void run() {
		
		char c;
		for(int i=0;i<10;i++) {
			c=alfabeto.charAt((int)(Math.random()*26));
			t.lanzar(c);
		}
	}
	
}
