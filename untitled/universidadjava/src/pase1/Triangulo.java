package pase1;

import java.util.Scanner;
public class Triangulo {
    // En el siguiente ejercicio se solicita calcular el area y el perimetro de un Rectangulo, para ello debemos crear las siguientes variables


    //update data perimetro area

    public static void main(String[] args){

        Scanner  alto1 = new Scanner(System.in);

        System.out.println("Ingrese altura: ");
        int alto = alto1.nextInt();


        Scanner ancho1 = new Scanner(System.in);
        System.out.println("Ingrese anche");

        int amcho = ancho1.nextInt();


        System.out.println("La area es: " + alto*amcho);

        System.out.println("El perimetro es " + (alto + amcho)*2);


    }
}
