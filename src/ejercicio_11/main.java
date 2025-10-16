package ejercicio_11;

public class main {

	public static void main(String[] args) throws InterruptedException {

		Tuberia t = new Tuberia();
		Semaforo verde = new Semaforo("Verde",t);
		Semaforo ambar = new Semaforo("Ambar",t);
		Semaforo rojo = new Semaforo("Rojo",t);
		System.out.println("Empieza el programa");
		verde.start();
		ambar.start();
		rojo.start();
		
		verde.join();
		ambar.join();
		rojo.join();
		System.out.println("Termina el programa");
	}

}
