package ejercicio7;

public class main {

	public static void main(String[] args) throws InterruptedException {

		Tuberia7 t = new Tuberia7();
		Consumidor consumidor = new Consumidor(t);
		Productor productor = new Productor(t);
		
		System.out.println("Comienza el programa");
		productor.start();
		consumidor.start();
		productor.join();
		consumidor.join();
		System.out.println("Termina el programa");
	}

}
