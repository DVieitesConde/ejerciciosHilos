package ejercicio5;

public class main {

	public static void main(String[] args) throws InterruptedException {

		Tuberia5 t=new Tuberia5();
		Hilo5 camello1 = new Hilo5(t,"camello1");
		Hilo5 camello2 = new Hilo5(t,"camello2");
		Hilo5 camello3 = new Hilo5(t,"camello3");
		Hilo5 camello4 = new Hilo5(t,"camello4");
		Hilo5 camello5 = new Hilo5(t,"camello5");
		
		System.out.println("Empieza la carrera");
		
		camello1.start();
		camello2.start();
		camello3.start();
		camello4.start();
		camello5.start();
		
		camello1.join();
		camello2.join();
		camello3.join();
		camello4.join();
		camello5.join();
		
		System.out.println("Termina la carrera");
		
		t.verPodio();
	}

}
