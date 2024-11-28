package Ejercicios_Practicos_192381.Unidad_2;

public class intercambioFallido {

    
    public static void intercambiar(int x, int y) {
        System.out.println("Dentro de 'intercambiar': antes del intercambio -> x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro de 'intercambiar': después del intercambio -> x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        
        System.out.println("Antes de llamar a 'intercambiar': a = " + a + ", b = " + b);

        
        intercambiar(a, b);

        
        System.out.println("Después de llamar a 'intercambiar': a = " + a + ", b = " + b);
    }
}
