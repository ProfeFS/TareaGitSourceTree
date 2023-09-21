package tareas_git;

import java.util.Random;
import java.util.Scanner;

	public class TareaEjemplo {

		static Scanner sc = new Scanner(System.in);
		public static double num1;
		public static double num2;
		
		public static double ejecutaSuma() {
			pedirDatos();
			return sumar(num1, num2);
		}

		private static void pedirDatos() {
			System.out.println("Ingresa número 1: ");
			num1 = sc.nextDouble();
			System.out.println("Ingresa número 2: ");
			num2 = sc.nextDouble();
		}

		private static double sumar(double num1, double num2) {
			return num1 *num2;
		}

	}


