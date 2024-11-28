package Ejercicios_Practicos_192381.Unidad_1;

public class tienda {
    public static void main(String[] args) {
        
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        
        double descuentoInicial = 0.15;

        
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuentoInicial);
        double precioPantalonConDescuento = precioPantalon * (1 - descuentoInicial);

        
        double descuentoAdicional = 0.05;
        double precioSegundaCamiseta = precioCamisetaConDescuento * (1 - descuentoAdicional);

        
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamiseta;

        
        System.out.println("Precio de la primera camiseta con descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio del pantalón con descuento: $" + precioPantalonConDescuento);
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + precioSegundaCamiseta);
        System.out.println("Precio total: $" + precioTotal);
    }
}
