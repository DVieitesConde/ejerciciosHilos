package ejercicio1;
public class Hilo extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<500;i++) {
			try{
				System.out.println("Contando hilo: "+this.getId()+": "+i);
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
