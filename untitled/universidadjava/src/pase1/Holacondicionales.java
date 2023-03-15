package pase1;

public class Holacondicionales

{
    public static void main(String[] args) {

        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a>= 0 && a <=10;// operador AND &&

        if (resultado){
            System.out.println("dentro del rango");
        }else{
            System.out.println("fuera del rango");
        }

        // operador OR si uno de ellos es verdadero entonces el resultado es verdadero

        var vacaciones = true;

        var diaDescanso = false;

        if(vacaciones || diaDescanso){
            System.out.println("padre puede asistir al juego del hijo");
        }else{
            System.out.println("el padre esta ocupado");

        }

    }

}
