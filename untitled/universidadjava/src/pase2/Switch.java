package pase2;

import java.util.Scanner;

public class Switch {

    public static void main (String[] args){
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa numero de mes ");
        int numero = numero1.nextInt();

        var numeroTexto = "Valor desconocido";

        switch (numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2 :
                numeroTexto = "Numero dos";
                break;
            case 3 :
                numeroTexto = "Numero trws";
                break;
            case 4 :
                numeroTexto = "numero cuatro";

                break;

            default:
                numeroTexto = "caso no encontrado";


        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
