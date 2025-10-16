package ejercicio9;

public class main {

	public static void main(String[] args) {
		Tuberia9 t = new Tuberia9();
		Hilo9 rey=new Hilo9("Rey",t);
		Hilo9 caballero1=new Hilo9("caballero1",t);
		Hilo9 caballero2=new Hilo9("caballero2",t);
		Hilo9 caballero3=new Hilo9("caballero3",t);
		System.out.println("Comienzo");
			caballero1.start();
			caballero2.start();
			caballero3.start();
			rey.start();

		try {
			caballero1.join();
			caballero2.join();
			caballero3.join();
			rey.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final");
	}

}
