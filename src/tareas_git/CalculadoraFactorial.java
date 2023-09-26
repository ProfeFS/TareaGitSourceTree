package tareas_git;

import java.util.Scanner;

public class CalculadoraFactorial {


	public static int factorial(int numero){

		int factorial=1;

		for(int i=1;i<=numero;i++) {
			factorial*=i;
		}
		return factorial;
	}
}