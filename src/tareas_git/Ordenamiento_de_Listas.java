package tareas_git;

import java.util.Arrays;

public class Ordenamiento_de_Listas {
public static void main(String[] args) { 
		
		double[] numeros = {5.7, 2.1, 8.9, 1.3, 6.2}; // Lista de números para ordenar
		// Ordenar en orden ascendente 
		Arrays.sort(numeros); 
		
		System.out.println("Orden ascendente:"); 
		for (double numero : numeros) { 
			System.out.println(numero); 
			} 
		
		for (int i = 0; i < numeros.length / 2; i++) { 
			double temp = numeros[i]; 
			numeros[i] = numeros[numeros.length - 1 - i]; 
			numeros[numeros.length - 1 - i] = temp; 
			}
		
		System.out.println("Orden descendente:"); 
		for (double numero : numeros) { 
			System.out.println(numero); } 
		} 
}
