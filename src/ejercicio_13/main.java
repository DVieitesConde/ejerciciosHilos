package ejercicio_13;

public class main {

	public static void main(String[] args) {
		Paso paso = new Paso();
		
		Persona persona1 = new Persona(paso,"Laura");
		Persona persona2 = new Persona(paso,"Miguel");
		Persona persona3 = new Persona(paso,"Sofia");
		Persona persona4 = new Persona(paso,"Mateo");
		Persona persona5 = new Persona(paso,"Valentina");
		
		Coche coche1 = new Coche(paso, "Coche rojo");
		Coche coche2 = new Coche(paso, "Coche azul");
		Coche coche3 = new Coche(paso, "Coche amarillo");
		Coche coche4 = new Coche(paso, "Coche verde");
		Coche coche5 = new Coche(paso, "Coche naranja");
		Coche coche6 = new Coche(paso, "Coche blanco");
		Coche coche7 = new Coche(paso, "Coche negro");
		Coche coche8 = new Coche(paso, "Coche gris");
		Coche coche9 = new Coche(paso, "Coche rosa");
		Coche coche10 = new Coche(paso, "Coche morado");
		
		persona1.start();
		persona2.start();
		persona3.start();
		persona4.start();
		persona5.start();
		
		coche1.start();
		coche2.start();
		coche3.start();
		coche4.start();
		coche5.start();
		coche6.start();
		coche7.start();
		coche8.start();
		coche9.start();
		coche10.start();
		


		
	}

}
