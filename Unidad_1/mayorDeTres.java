package Ejercicios_Practicos_192381.Unidad_1;

import java.util.Scanner;

public class mayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();

        
        double mayor;
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }


        System.out.println("El número mayor es: " + mayor);
        scanner.close();
    }
}
