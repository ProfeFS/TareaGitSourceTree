package tareas_git;

import java.util.Arrays;


public class Ordenamiento_de_Listas {

	public static void main(String[] args) { 
		
		double[] numeros = {5.7, 2.1, 8.9, 1.3, 6.2};
		 
		Ordenamiento_de_Listas(numeros, true);
		 
		
		System.out.println("Orden ascendente:"); 
		for (double numero : numeros) { 
			System.out.println(numero); 
			}  
		
		Ordenamiento_de_Listas(numeros, false);
		
		System.out.println("Orden descendente:"); 
		for (double numero : numeros) { 
			System.out.println(numero); 
		}
	}
	
	public static void Ordenamiento_de_Listas(double[] numeros, boolean ascendente) {
		if(ascendente) {
			Arrays.sort(numeros);
		}else{
			for (int i = 0; i < numeros.length / 2; i++) { 
				double temp = numeros[i];
				numeros[i] = numeros[numeros.length - 1 - i];
				numeros[numeros.length - 1 - i] = temp;
				}
		} 
	}
}
