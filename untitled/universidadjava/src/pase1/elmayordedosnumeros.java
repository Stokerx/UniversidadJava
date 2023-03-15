package pase1;

import java.util.Scanner;
public class elmayordedosnumeros {

    public static void main(String[] args) {

        Scanner $numero = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");

        int numero1 = $numero.nextInt();

        Scanner $numero2 = new Scanner(System.in);

        System.out.println("Proporcionar el numero2");

        int numero2 = $numero2.nextInt();

        /*if(numero1 > numero2){ metodo de rodrigo
            System.out.println("el numero1 mayor es: " + numero1);

        } else if (numero2 > numero1) {
            System.out.println("El numero2 mayor es : " + numero2);
        }else{
            System.out.println(" no has ingresado ningun numero");
        } */

        System.out.println("El numero mayor es: ");
        System.out.println(numero1 > numero2 ? numero1 : numero2);

    }

}
