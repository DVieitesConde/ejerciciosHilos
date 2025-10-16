package ejercicio3y4;

public  class Tuberia {

	private int n=0;
	String ultimoHilo="";
	
	Tuberia(){
		System.out.println("Se ha creado la Tuberia");
	}
	
	public synchronized void  contar(String hilo) {
		while(ultimoHilo.equals(hilo)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		n++;
		ultimoHilo=hilo;
		System.out.println(hilo+": "+n);
		notifyAll();
	}
	
}
