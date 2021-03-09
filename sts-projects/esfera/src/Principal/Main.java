package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");		
		double raio = sc.nextDouble();
				
		Esfera.circunferencia(raio);
		Esfera.volume(raio);		
	
		System.out.println("PI: "+Esfera.pi);
		
		sc.close();
			
	}
}