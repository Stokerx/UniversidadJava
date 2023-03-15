package pase2;
import java.util.Scanner;
public class Ejercicio_switch {

    public static void main(String[] args) {

        Scanner  mes1 = new Scanner(System.in);
        System.out.println("Ingrese dato del mes :");

        var mes = mes1.nextInt();

        var estacion = "Estacion desconocida";
        switch (mes){
            case 1 : case 2: case 12:
                estacion = "invierno";
                break;

            case 3: case 4 : case 5 :
                estacion = "primavera";
                break;

            case 6 : case 7 : case 8:
                estacion = "Verano";

            case 9 : case 10: case 11:
                estacion = "otonio";
                break;

            default:

                estacion = "Estacion desconocida";

        }
        System.out.println("Estacion es " + estacion);
    }

}
