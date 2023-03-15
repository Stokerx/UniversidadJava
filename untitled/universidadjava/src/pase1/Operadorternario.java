package pase1;

public class Operadorternario {
    public static void main(String[] args) {

    // operador ternario ? resultado true : resultado false;
        var resultado = (3 > 2) ? "verdadero " : "es falso";

        System.out.println("resultado = " + resultado);

        var numero = 0;

        resultado = (numero % 2 == 0) ? "numero part": "numero impar";

        System.out.println("numero = " + resultado);



    }
}
