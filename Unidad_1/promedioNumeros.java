package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class promedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] numeros = new double[5];
        double suma = 0;

        
        System.out.println("Introduce 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];  
        }

        
        double promedio = suma / 5;

        
        System.out.println("El promedio de los números ingresados es: " + promedio);

        
        scanner.close();
    }
}
