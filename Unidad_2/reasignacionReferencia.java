package Ejercicios_Practicos_192381.Unidad_2;
class Persona {
    String nombre;
}

public class reasignacionReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignarPersona: " + persona.nombre);  // Debería imprimir Ana
    }

    public static void reasignarPersona(Persona persona) {
        persona = new Persona();  // Creamos un nuevo objeto
        persona.nombre = "María";
    }
}