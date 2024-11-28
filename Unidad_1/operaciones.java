package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;
        double modulo = 0;

        
        if (numero2 != 0) {
            division = numero1 / numero2;
            modulo = numero1 % numero2;
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("División: No se puede dividir entre cero.");
            System.out.println("Módulo: No se puede calcular el módulo con divisor cero.");
        }
        scanner.close();
        
    }
}

