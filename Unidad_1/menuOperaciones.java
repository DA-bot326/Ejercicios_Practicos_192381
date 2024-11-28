package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class menuOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        
        int opcion = scanner.nextInt();

        
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        
        switch (opcion) {
            case 1: 
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2: 
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3: 
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4: 
                if (numero2 != 0) { 
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default: 
                System.out.println("Opción inválida. Por favor, selecciona una opción entre 1 y 4.");
                break;
        }

        
        scanner.close();
    }
}
