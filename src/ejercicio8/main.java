package ejercicio8;

public class main {

	public static void main(String[] args) {
		Tuberia8 t = new Tuberia8();
		Hilo8 rey=new Hilo8("Rey",t);
		Hilo8 caballero1=new Hilo8("caballero1",t);
		Hilo8 caballero2=new Hilo8("caballero2",t);
		Hilo8 caballero3=new Hilo8("caballero3",t);
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
