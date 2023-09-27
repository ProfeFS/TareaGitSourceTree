package tareas_git;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void CalculadoraArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige la forma que deseas: ");
        System.out.println("1. Rectangulo");
        System.out.println("2. Circulo");
        System.out.println("3. Triángulo");

        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Introduce la altura del rectangulo: ");
                double l = scanner.nextDouble();
                System.out.println("Introduce la anchura del rectangulo: ");
                double w = scanner.nextDouble();
                double cuadrado = l * w;
                System.out.println("El área del rectangulo es: " + cuadrado);
                break;
            case 2:
                System.out.println("Introduce el radio del circulo: ");
                double r = scanner.nextDouble();
                double circulo = Math.PI * Math.pow(r, 2);
                System.out.println("El área del circulo es: " + circulo);
                break;
            case 3:
                System.out.println("Introduzca la base del triangulo: ");
                double b = scanner.nextDouble();
                System.out.println("Introduzca la altura del triangulo: ");
                double h = scanner.nextDouble();
                double triangulo = 0.5 * b * h;
                System.out.println("El área del triangulo es: " + triangulo);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}