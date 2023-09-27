package tareas_git;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Contador {

	public static String cadena;
	
	static Scanner sc = new Scanner(System.in);
	
	public Contador() {
	
	}
	public static String pedirFrase() {
		System.out.println("Dime una oracion");
		String oracion = sc.nextLine();
		return oracion;
	}
	
	public static void contadorPalabras() {
		
		StringTokenizer st = new StringTokenizer(pedirFrase());
		System.out.println("Numero de palabras: " + st.countTokens());
	}
	
}