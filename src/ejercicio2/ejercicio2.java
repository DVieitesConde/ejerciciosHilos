package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Introuzca un color");
		String color1=s.nextLine();
		System.out.println("Introuzca un color");
		String color2=s.nextLine();
		System.out.println("Introuzca un color");
		String color3=s.nextLine();
		
		Hilo2 hilo1=new Hilo2(color1);
		Hilo2 hilo2=new Hilo2(color2);
		Hilo2 hilo3=new Hilo2(color3);

		hilo1.start();
		hilo2.start();
		hilo3.start();

	}

}
