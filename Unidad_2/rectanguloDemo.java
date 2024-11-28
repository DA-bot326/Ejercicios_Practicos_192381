package Ejercicios_Practicos_192381.Unidad_2;

public class rectanguloDemo {

    
    static class Rectangulo {
        int ancho;
        int alto;

        
        public Rectangulo(int ancho, int alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
    }

    
    public static void modificarRectangulo(Rectangulo r) {
        System.out.println("Dentro de 'modificarRectangulo': antes de modificar -> ancho = " + r.ancho + ", alto = " + r.alto);
        r.ancho = 20;
        r.alto = 15;
        System.out.println("Dentro de 'modificarRectangulo': después de modificar -> ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        
        Rectangulo rect = new Rectangulo(5, 10);

       
        System.out.println("Antes de llamar a 'modificarRectangulo': ancho = " + rect.ancho + ", alto = " + rect.alto);

       
        modificarRectangulo(rect);

        
        System.out.println("Después de llamar a 'modificarRectangulo': ancho = " + rect.ancho + ", alto = " + rect.alto);
    }
}
