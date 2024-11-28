package Ejercicios_Practicos_192381.Unidad_1;
import java.util.Scanner;
public class constantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        System.out.println("Ingrese el radio de su circunferencia: ");
        double radio = scanner.nextDouble();
        double area = pi*radio*radio;
        System.out.println("El area de su circunferencia es: "+area);
        scanner.close();
    }
}
