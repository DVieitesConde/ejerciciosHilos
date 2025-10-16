package ejercicio5;

public class Tuberia5 {
	String [] podio=new String[5];
	int n=0;
	Tuberia5() {
		
	}
	
	public void meta(String nombre) {
		podio[n]=nombre;
		n++;
	}
	
	public void verPodio() {
		System.out.println("Podio: ");
			for(int i=0;i<podio.length;i++) {
				System.out.println((i+1)+"º: " + podio[i]);
			}
			
	}
	
}
