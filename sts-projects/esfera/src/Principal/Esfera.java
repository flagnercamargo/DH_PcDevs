package Principal;

public class Esfera {

	static final double pi = 3.14159265;	
	
	public void circunferencia(double raio) {		
		double circunferencia = 2.0*Math.PI*raio;
		System.out.println("Circunferência: "+circunferencia);		
	}	
	
	public void volume(double raio) {		
		double volume = 4.0*Math.PI*raio*raio*raio/3;
		System.out.println("Volume: "+volume);		
	}
}
