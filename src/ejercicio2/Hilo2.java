package ejercicio2;


public class Hilo2 extends Thread{
	
	String color;
	public Hilo2(String color){
		this.color=color;
	}
	
	@Override
	public void run() {
		

		System.out.println("Hola, este es el mundo de color " + color);
		 
	}
	
}
