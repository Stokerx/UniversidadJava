package pase2;
import java.util.Scanner;
public class Tarea_ciclos {

    public static void main(String[] args) {

        /* El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido

        Scanner calificacion1 = new Scanner(System.in);
        System.out.println("Ingrese la nota de calificacion de Rodrigo: ");

        int calificacion = calificacion1.nextInt();
        var simi = "valor desconocido ";
        switch (calificacion){
            case 1 : case 2: case 3: case 4: case 5:
                simi = "F";
                break;
            case 6 :
                simi = "D";
                break;
            case 7 :
                simi = "D.";
                break;
            case 8 :
                simi = "C";
                break;
            case 9 :
                simi = "B";
                break;
            case 10:
                simi = "A";
                break;

        }

        System.out.println("la nota del alumno es =  " + simi); */

        Scanner calificacion3 = new Scanner(System.in);
        System.out.println("Ingrese el valor de la nota de Luis : ");

        var calificaciones2 = calificacion3.nextInt();

        if(calificaciones2 >= 0 && calificaciones2 >= 5){
            System.out.println("Nota es F");
            
        } else if (calificaciones2 >=6 && calificaciones2 >= 7) {
            System.out.println("Nota es D");

            
        } else if (calificaciones2 >= 7 && calificaciones2 >= 8) {

            System.out.println("Nota es C");

        }else if (calificaciones2 >= 8 && calificaciones2 >= 9){
            System.out.println("Nota es B");
        }else if (calificaciones2 >=9 && calificaciones2>=10){
            System.out.println("Nota es A la maxima");
        }

    }
}
