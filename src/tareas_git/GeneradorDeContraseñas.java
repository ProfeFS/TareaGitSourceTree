package tareas_git;

import java.util.Random;
import java.util.Scanner;


public class GeneradorDeContraseñas {
	public static int longitud;
	public static String contrasenia ="";
	public static int complejidad;
	public static Random r = new Random();
	public static int limite = 9;
	static Scanner a = new Scanner(System.in);
	private static void datos() {
		System.out.println("dime, ¿que longitud quieres que tenga tu contraseña?");
		longitud = a.nextInt();
		System.out.println("dime, ¿que complejidad quieres en la contraseña?(1- numeros 2.-alfanumérico)");
		complejidad = a.nextInt();
	}
	public static String contr() {
		datos();
		if (complejidad==1) {
			for (int i=0; i<longitud;i++) {
				contrasenia=(contrasenia+(r.nextInt(limite+1)));
			}
		}
		if (complejidad==2) {
			char rchar;
			for (int i=0; i<longitud;i++) {
				contrasenia=(contrasenia+(r.nextInt(limite+1)));
				i++;
				rchar = (char) (r.nextInt(26) + 'a');
				contrasenia=(contrasenia+(rchar));
				
			}
			
		}
		else {
			System.out.println("reinicie el programa y ponga una opcion válida");
		}
		return contrasenia;
		 
	}
}
