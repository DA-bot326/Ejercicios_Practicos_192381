package Ejercicios_Practicos_192381.Unidad_1;

public class retiroBancario {
    public static void main(String[] args) {
        
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasEnUnMes = 4;

        
        double saldoFinal = saldoInicial - (retiroSemanal * semanasEnUnMes);

        // Mostrar resultado
        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Cantidad retirada por semana: $" + retiroSemanal);
        System.out.println("Saldo final después de un mes: $" + saldoFinal);
    }
}
