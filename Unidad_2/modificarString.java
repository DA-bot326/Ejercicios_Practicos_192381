package Ejercicios_Practicos_192381.Unidad_2;

public class modificarString {

    
    public static void modificarCadena(String texto) {
        System.out.println("Dentro de 'modificarCadena': antes de modificar -> texto = " + texto);
        texto = texto + " modificado"; 
        System.out.println("Dentro de 'modificarCadena': después de modificar -> texto = " + texto);
    }

    public static void main(String[] args) {
        
        String texto = "Texto original";

        
        System.out.println("Antes de llamar a 'modificarCadena': texto = " + texto);

        
        modificarCadena(texto);

        
        System.out.println("Después de llamar a 'modificarCadena': texto = " + texto);
    }
}
