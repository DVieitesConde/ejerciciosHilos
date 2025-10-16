	package ejercicio_11;
	
	public class Tuberia {
		private int n=0;
		Tuberia(){
	
		}
	
		public synchronized void cambiar(String color) {
			if(color.equals("Verde")) {
				while(n!=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Verde");
				n++;
				notifyAll();
	
			}else if(color.equals("Ambar")){
				while(n!=1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Ambar");
				n++;
				notifyAll();
	
			}else {
	
				while(n!=2) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rojo");
				n=0;
				notifyAll();
	
	
			}
		}
	}
	
	
