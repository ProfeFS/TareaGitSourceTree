package tareas_git;

import java.util.Random;

public class GeneradorAleatorios {
	
	Random aleatorio= new Random();
	
	public int numeroAleatorio() {
		
		return aleatorio.nextInt(1000);
		
	}

}
