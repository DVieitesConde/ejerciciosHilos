package ejercicio6;

public class main {

	public static void main(String[] args) {
		Tuberia6 t = new Tuberia6();
		Dado d1 = new Dado(t, "dado1");
		Dado d2 = new Dado(t, "dado2");
		d1.start();
		d2.start();
		try {
			d1.join();
			d2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t.resultado();
		
	}

}
