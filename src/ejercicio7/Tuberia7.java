package ejercicio7;

public class Tuberia7 {
	
	char [] array=new char[5];
	int siguiente=0;

	Tuberia7(){
		
	}
	
	public synchronized void lanzar(char c) {
		if(siguiente>=5) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			notifyAll();
		}
		array[siguiente]=c;
		siguiente ++;
		System.out.println("Se ha lanzado el caracter: "+c);
	}
	
	public synchronized char recoger() {
		if(siguiente<=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			notifyAll();
		}
		siguiente--;
		System.out.println("Se ha recogido el caracter: " + array[siguiente]);
		return array[siguiente];
	}
	
}
