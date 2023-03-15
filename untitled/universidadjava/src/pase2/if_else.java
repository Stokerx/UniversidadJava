package pase2;

public class if_else {

    public static void main(String[] args) {
        /*var condicion = false;

        if( condicion)
            System.out.println("Condicion verdadera");

        else
            System.out.println("condicion falsa"); */


        //else if

        var numero = 2;
        var numeroTexto = "numero desconocido";

        if (numero ==1){
            numeroTexto = "numero Uno";
        } else if (numero == 2) {

            numeroTexto = "Numero dos";

        } else if (numero == 3) {

            numeroTexto = " Numero tres";

        }
        System.out.println("numeroTexto = " + numeroTexto);

    }

}
