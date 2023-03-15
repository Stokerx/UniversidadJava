package pase2;

public class monthy_year {

    public static void main (String[] args){

        /*var tiempo = "Primavera";
        var valor = "tiempo desconocido";
        if(tiempo == "otono "){
            valor =  "es otono";

        } else if (tiempo == "invierno") {

            valor = " es invierno";


        } else if (tiempo == "Primavera") {

            valor = "Es Primavera";

        } else if (tiempo == "Verano") {
            valor  = "Es Verano";
        }

        System.out.println("valor = " + valor); */

        var mes = 1;

        var estacion = "Invierno";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "otono";

        } else if (mes == 9 || mes == 10 || mes == 11 || mes == 12) {
            estacion = "verano";
        }

        System.out.println("estacion = " + estacion);
    }
}
