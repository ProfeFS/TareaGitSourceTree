package tareas_git;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    
        static ArrayList<String> tareas = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static int tarea;
        public static void listaTareas() {
        while (true) {
            System.out.println("Introduzca una tarea, 'mostrar' para ver lista de tareas o escriba 'salir' para salir):");
            String entrada = scanner.nextLine();
            tarea=1;

            if (entrada.equalsIgnoreCase("salir")) {
            	System.out.println("Lista de tareas:");
                for (int i = 0; i < tareas.size(); i++) {
                    System.out.println((i + 1) + ". " + tareas.get(i));
                }
            	break;
            }
            else if(entrada.equalsIgnoreCase("mostrar")) {
            	System.out.println("Lista de tareas:");
                for (int i = 0; i < tareas.size(); i++) {
                    System.out.println((i + 1) + ". " + tareas.get(i));
                }
                tarea=0;
            }

            if(tarea==1) {
            	tareas.add(entrada);
            	System.out.println("Tarea agregada.");
            }
            
        }

        

        scanner.close();
    }
}
