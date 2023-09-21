package tareas_git;
import java.util.Scanner;
public class calculadoraIMC {

	static Scanner sc = new Scanner(System.in);
	public static double peso;
	public static double altura;
	
	public static void main(String[] args) {
		double resultado=ejecutarprograma();
		System.out.print(Math.round(resultado));
	}
	
	public static double ejecutarprograma() {
		introducirdatos();
		return multiplicar(peso, altura);
	}

	private static void introducirdatos() {
		System.out.println("Ingresa Tu peso en kilogramos: ");
		peso = sc.nextDouble();
		System.out.println("Ingresa Tu altura en metros: ");
		altura = sc.nextDouble();
	}

	private static double multiplicar(double peso, double altura) {
		return peso/(altura*altura);
	}

}
