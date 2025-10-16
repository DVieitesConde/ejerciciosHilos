package ejercicio_10;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Tuberia t = new Tuberia();
		Persona wellington = new Persona ("Wellington",t);
		Persona napoleon = new Persona ("Napoleon",t);
		Persona agustina = new Persona ("Agustina de Aragon",t);
		System.out.println("Comienza el programa");
		wellington.start();
		napoleon.start();
		agustina.start();
		
		wellington.join();
		napoleon.join();
		agustina.join();
		System.out.println("Termina el programa");
	}

}
