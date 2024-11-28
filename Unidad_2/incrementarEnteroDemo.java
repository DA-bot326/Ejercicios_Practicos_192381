package Ejercicios_Practicos_192381.Unidad_2;

public class incrementarEnteroDemo {

    
    public static int incrementar(int x) {
        System.out.println("Dentro de 'incrementar': antes de incrementar -> x = " + x);
        x = x + 1;
        System.out.println("Dentro de 'incrementar': después de incrementar -> x = " + x);
        return x;
    }

    public static void main(String[] args) {
        
        int x = 10;

        
        System.out.println("Antes de llamar a 'incrementar': x = " + x);

        
        incrementar(x);

        
        System.out.println("Después de llamar a 'incrementar' (sin asignar el valor retornado): x = " + x);

        
        x = incrementar(x);

        
        System.out.println("Después de llamar a 'incrementar' (asignando el valor retornado): x = " + x);
    }
}
