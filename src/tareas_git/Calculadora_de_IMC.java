package tareas_git;

import java.util.Scanner;

public class Calculadora_de_IMC {

	static Scanner sc = new Scanner(System.in);
	public static double altura;
	public static double peso;
	
	public static double hazImc() {
		pedirDatos();
		return imc(altura, peso);
	}
	
	public static void pedirDatos() {
		System.out.println("Ingresa tu altura: ");
		altura = sc.nextDouble();
		System.out.println("Ingresa tu peso: ");
		peso = sc.nextDouble();
	}

	public static double imc(double altura, double peso) {
		return peso/altura;
	}

}
