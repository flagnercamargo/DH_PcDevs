package principal;

public class Esfera {

	static final double pi = 3.14159265;	
	
	public static void circunferencia(double raio) {		
		double circunferencia = 2.0*Math.PI*raio;
		System.out.println("Circunferência: "+circunferencia);		
	}	
	
	public static void volume(double raio) {		
		double volume = 4.0*Math.PI*raio*raio*raio/3;
		System.out.println("Volume: "+volume);		
	}
}
