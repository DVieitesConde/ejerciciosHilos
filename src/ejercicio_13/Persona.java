package ejercicio_13;

public class Persona extends Thread{
	
	private Paso paso;
	private String nombre;

	Persona(Paso paso, String nombre){
		
		this.paso=paso;
		this.nombre=nombre;
		
	}
	
	public void run() {
		
		try {
			this.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		paso.cruzar(this.nombre);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
