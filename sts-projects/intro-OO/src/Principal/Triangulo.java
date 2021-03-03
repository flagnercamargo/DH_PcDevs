package Principal;

public class Triangulo {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double calcularAreaTriangulo() {
		double p = (ladoA+ladoB+ladoC)/2;
		double area = Math.sqrt((p*(p-ladoA)*(p-ladoB)*(p-ladoC))); //sqrt = raiz quadrada
		
		return area;
	}

}
