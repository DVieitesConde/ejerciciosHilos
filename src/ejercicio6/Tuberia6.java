package ejercicio6;

public class Tuberia6 {

	int total=0;
	int puntos1=0;
	int puntos2=0;
	
	public Tuberia6() {
		
	}
	
	public void pasarPuntos(int puntos, String hilo) {
		if(hilo=="dado1"){
			puntos1=puntos;
		}else {
			puntos2=puntos;
		}
	}
	
	public synchronized void resultado() {
		total=puntos1+puntos2;
		System.out.println("has sacado " + total + " puntos");	
		if(total==2) {
			System.out.println("Perdiste");
		}else if(total==11 || total==7) {
			System.out.println("Ganaste");
		}else {
			System.out.println("Tira otra vez");
		}
	}
	
}
