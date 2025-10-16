package ejercicio9;

public class Tuberia9 {
	static boolean ok=false;
	static int n=0;
	Tuberia9(){
		
	}
	
	public synchronized void Saludar(String nombre) {
			if(nombre.equalsIgnoreCase("Rey")) {
			while (n < 3) {
				try {
	                 wait();
	           }catch (InterruptedException e) {
	                 e.printStackTrace();
	           }
	       }
			System.out.println(nombre+": Buenos dias subditos");
			ok=true;
			notifyAll();
		}else {
			n++;
			if (n == 3) {
                notifyAll();
            }
			while(!ok) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(nombre+": Saludos su majestad");
		}
		
	}
	
}
