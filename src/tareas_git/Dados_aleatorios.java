package tareas_git;
import java.util.Random;
public class Dados_aleatorios {
	
	public static Random rnd = new Random();

		
	public static void dado(){
		System.out.println("En el dado uno ha salido un "+(int)(rnd.nextDouble() * 6 + 1));
		System.out.println("En el dado dos ha salido un "+(int)(rnd.nextDouble() * 6 + 1));
		 
}
}