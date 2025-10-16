package ejercicio_12;

public class Persona extends Thread {

	private Habitacion miHabitacion;

	Persona(Habitacion miHabitacion) {

		this.miHabitacion = miHabitacion;

	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			miHabitacion.abrir(this.getName());
			miHabitacion.cerrar(this.getName());
		}
	}

}
