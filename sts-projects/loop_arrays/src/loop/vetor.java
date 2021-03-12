package loop;

import java.util.Scanner;

public class vetor {
	public static void main(String[] args) {
		//calcVetor();
	}
	public static void calcVetor() {
		Scanner sc = new Scanner(System.in);
		
		int n = 10; // tamanho do vetor
	    int v[] = new int[n]; // declaração do vetor "v"
	    int i; // índice ou posição
	    
	    // Entrada de Dados
	    for (i=0; i<n; i++) {
	    	System.out.printf("Informe %do. valor de %d: ", (i+1), n);
	    	v[i] = sc.nextInt();
	    }
	    
	 // Processamento: somar todos os valores, definir o maior e o menor valor
	    int soma = 0;
	    int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
	    int maior = v[0];
	    
	    for (i=0; i<n; i++) {
	    	soma = soma + v[i];
	    	
	    	if (v[i] < menor)
	    		menor = v[i];
	    	
	    	if (v[i] > maior)
	    		maior = v[i];
	    }
	    
	    // Saída (resultados)
	    System.out.println();
	    for (i=0; i<n; i++) {
	    	if (v[i] == menor) {
	    		System.out.printf("v[%d] = %d <--- menor valor\n", i, v[i]);
	    	}else {
	    		if (v[i] == maior) {
	    			System.out.printf("v[%d] = %d <--- maior valor\n", i, v[i]);
	    		}else {
	    			System.out.printf("v[%d] = %d\n", i, v[i]);
	    		}
	    	}
	    }
	    System.out.printf("\nSoma = %d\n", soma);


		

	    sc.close();
	}
		
}