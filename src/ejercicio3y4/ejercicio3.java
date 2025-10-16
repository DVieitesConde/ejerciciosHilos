package ejercicio3y4;

public class ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Comienza el programa principal");
		
		Tuberia t=new Tuberia();
		
		Hilo3 hilo1 = new Hilo3(t);
		Hilo3 hilo2 = new Hilo3(t);
		
		hilo1.start();
		hilo2.start();
		try{
			hilo1.join();
			hilo2.join();
		}catch(InterruptedException e) {
			System.out.println();
		}
		System.out.println("Fin del programa principal");
	}

}
