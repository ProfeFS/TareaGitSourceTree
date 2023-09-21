package tareas_git;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {

    public static void main(String[] args) {

        LocalDate fechaDeNacimiento = obtenerFechaDeNacimiento();
        LocalDate fechaActual = obtenerFechaActual();
        Period edad = calcularEdad(fechaDeNacimiento, fechaActual);

        imprimirEdad(edad);
        
    }


    private static LocalDate obtenerFechaDeNacimiento() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca su fecha de nacimiento (yyyy-mm-dd) o (año-mes-dia): ");
        String fechaDeNacimientoStr = scanner.nextLine();
        LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimientoStr);

        return fechaDeNacimiento;
    }
    


    private static LocalDate obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual;
    }


    
    private static Period calcularEdad(LocalDate fechaDeNacimiento, LocalDate fechaActual) {
        Period edad = Period.between(fechaDeNacimiento, fechaActual);
        return edad;
    }

    

    private static void imprimirEdad(Period edad) {
        System.out.println("Tú edad ha dia de hoy es : " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días.");
    }
}