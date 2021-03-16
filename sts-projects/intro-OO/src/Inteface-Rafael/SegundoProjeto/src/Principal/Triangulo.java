package Principal;

public class Triangulo {
	double ladoA;
	double ladoB;
	double ladoC;
	
	public double calcularAreaTriangulo() {
		
		double p = (ladoA+ladoB+ladoC)/2;
		double area = Math.sqrt((p*(p-ladoA)*(p-ladoB)*(p-ladoC))); 
		
		return area;
	}
}
