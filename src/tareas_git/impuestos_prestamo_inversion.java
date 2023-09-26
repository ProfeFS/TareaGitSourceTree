package tareas_git;

import java.util.Scanner;

public class impuestos_prestamo_inversion {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		System.out.println("dime de que tipo es:");
//		prestamo = sc.next();
//		inversion = sc.next();
//		
		double valor_prestamo, dinero_inversion, total;
		System.out.print("Selecciona la opción:\n1.Préstamo\n2.Inversión\n");
		int opcion = sc.nextInt();

		if (opcion == 1) {

			System.out.println("ingresa el valor del prestamo");

			valor_prestamo = sc.nextDouble();

			System.out.println("la comision es " + valor_prestamo * 5 / 100);

			total = valor_prestamo + valor_prestamo * 5 / 100;

			System.out.println("El total es " + total);

		}

		else if (opcion == 2) {

			System.out.println("ingresa el valor de la inversion");

			dinero_inversion = sc.nextDouble();

			System.out.println("la comision  es " + dinero_inversion * 35 / 100);

			total = dinero_inversion + dinero_inversion * 35 / 100;

			System.out.println("El total  es " + total);

		}

		else {

			System.out.println("Opción no válida");

		}
	}
}