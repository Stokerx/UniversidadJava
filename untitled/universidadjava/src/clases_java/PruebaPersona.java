package clases_java;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona persona1;

        persona1 = new Persona();
        persona1.nombre = "Rodrigo";
        persona1.apellido = "Luna";

        persona1.desplegarInformacion();

        Persona persona2 = new Persona();

        System.out.println("persona1 = " + persona1);
        System.out.println("Persona2 = " + persona2);
        persona2.desplegarInformacion();

        persona2.nombre = "Evelyn";
        persona2.apellido = "Luna";

        persona2.desplegarInformacion();


    }
}
