package ejercicio6;

public class Dado extends Thread{

		Tuberia6 t;
		
		Dado(Tuberia6 t, String name){
			this.t=t;
			setName(name);
		
		}
	
		public void run() {
			int puntos=(int) (Math.random()*6)+1;
			
			t.pasarPuntos(puntos, getName());
		}
		
}
