package tareas_git;

import java.util.Iterator;
import java.util.Scanner;

public class Tarea_10CalculadoraDescuentos {
	
		
		static Scanner sc = new Scanner(System.in);
		public static double num1;
		
		
		public static double ejecutaDescuento() {
			pedirDatos();
			return descuento(num1);
		}

		
		private static void pedirDatos() {
			System.out.println("Ingresa número que quieres hacer descuento: ");
			num1 = sc.nextDouble();
		}
			
		
		private static double descuento(double num1) {
			return (num1*50)/100;
		}

	
}




