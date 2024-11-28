package Ejercicios_Practicos_192381.Unidad_2;

public class modificarArrayDemo {

    // Método que modifica los valores de un array
    public static void modificarArray(int[] arr) {
        System.out.println("Dentro de 'modificarArray': antes de modificar -> " + java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; 
        }
        System.out.println("Dentro de 'modificarArray': después de modificar -> " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5};

        
        System.out.println("Antes de llamar a 'modificarArray': " + java.util.Arrays.toString(numeros));

        
        modificarArray(numeros);

        
        System.out.println("Después de llamar a 'modificarArray': " + java.util.Arrays.toString(numeros));
    }
}
