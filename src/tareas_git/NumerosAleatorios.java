package tareas_git;
import java.util.Scanner;
public class NumerosAleatorios {
	public void adivinaNumero() {
		Scanner sc=new Scanner(System.in);
	
		int numero=GeneradorAleatorios.numeroAleatorio();
		
		boolean correcto=false;
		 System.out.println("Juego iniciado\n");
		 System.out.println("Adivina el numero correcto ");
		while(!correcto) {
		System.out.println("Introduce un numero");
		int v=sc.nextInt();
		if(v==numero) {
			System.out.println("Numero correcto");
			System.out.println("!!Ganaste¡¡");
			System.out.println("El nuermo era: "+numero);
			correcto=true;
		}else {
			System.out.println("Numero Incorrecto");
		}
		}
	}
}
