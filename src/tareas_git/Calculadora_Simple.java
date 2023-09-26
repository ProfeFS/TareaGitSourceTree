package tareas_git;
//Calculadora Simple: Implementa una calculadora que pueda realizar operaciones matemáticas básicas como suma, resta, multiplicación y división.
import java.util.Scanner;
public class Calculadora_Simple {

	static Scanner entrada=new Scanner(System.in);
	public static double num1;
	public static double num2;


	public static void calculadora() {
		System.out.println();
		System.out.println("|||  Bienvenido a la calculadora simple. |||");

		System.out.println("-------------------------------------------");
		System.out.println("Ingresa número 1: ");
		num1 = entrada.nextDouble();
		System.out.println("Ingresa número 2: ");
		num2 = entrada.nextDouble();
		System.out.println("-------------------------------------------");
		System.out.println("Elija uno de las operaciones que quieras hacer: ");
		System.out.println("1: Suma   2: Resta   3: Multuplicación   4: División");

		int opcion = entrada.nextInt();

		switch(opcion) {

		case(1):
			System.out.println("Suma:");
			System.out.println(num1+ " + " +num2+ " = "+ (num1+num2) );
		break;
		case(2):
			System.out.println("Resta:");
			System.out.println(num1+ " - " +num2+ " = "+ (num1-num2) );
		break;
		case(3):
			System.out.println("Multiplicación:");
			System.out.println(num1+ " x " +num2+ " = "+ (num1*num2) );
		break;
		case(4):
			System.out.println("División:");
			System.out.println(num1+ " / " +num2+ " = "+ (num1/num2) );
		break;
		}



	}
}
