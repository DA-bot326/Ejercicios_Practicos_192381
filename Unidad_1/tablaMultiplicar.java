package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        
        scanner.close();
    }
}
