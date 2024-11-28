package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su altura: ");
        int altura = scanner.nextInt();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Su edad es: "+edad);
        System.out.println("Su altura es: "+altura);
        
        if (!nombre.isEmpty()) {
            // Obtener e imprimir la inicial
            char inicial = nombre.charAt(0);
            System.out.println("La inicial de su nombre es: " + inicial);
        } else {
            System.out.println("No se introdujo ninguna palabra.");
        }

        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }  
        scanner.close();
    }
}
