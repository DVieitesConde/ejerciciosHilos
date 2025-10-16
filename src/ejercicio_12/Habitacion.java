package ejercicio_12;

public class Habitacion {

	Puerta puerta;

	Habitacion(Puerta puerta){
		this.puerta=puerta;
	}

	public synchronized void abrir(String nombre) {

		while(this.puerta.isPuertaAbierta()){

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		this.puerta.setPuertaAbierta(true);
		System.out.println(nombre+" ha abierto la puerta");
		notifyAll();
	}


	public synchronized void cerrar(String nombre) {

		while(!this.puerta.isPuertaAbierta()){	

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.puerta.setPuertaAbierta(false);
		System.out.println(nombre+" ha cerrado la puerta");
		notifyAll();

	}
}
