package ejercicio_12;

public class main {

	public static void main(String[] args) {
		Puerta puerta=new Puerta();
		Habitacion miHabitacion=new Habitacion(puerta);
		Persona persona1=new Persona(miHabitacion);
		Persona persona2=new Persona(miHabitacion);

		persona1.setName("Alice");
		persona2.setName("Bob");

		persona1.start();
		persona2.start();



	}

}
