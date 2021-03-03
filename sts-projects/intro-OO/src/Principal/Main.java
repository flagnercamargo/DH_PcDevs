package Principal;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Informe os 3 lados do Triângulo X: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Informe os 3 lados do Triângulo Y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.calcularAreaTriangulo();
		double areaY = y.calcularAreaTriangulo();
		
		System.out.println("A área do triângulo X foi: "+areaX);
		System.out.println("A área do triângulo Y foi: "+areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do triângulo X é maior que a área do triângulo Y");
		}else {
			System.out.println("A área do triângulo Y é maior que a área do triângulo X");
		}
		sc.close();
	}
}