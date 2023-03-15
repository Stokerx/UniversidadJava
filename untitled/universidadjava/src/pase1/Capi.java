package pase1;

public class Capi {

    public static void main(String[] args) {

        // este tipo es de capi es imbecil

        // vamos a hacer una precedencia de Operaciones


        var x = 5;
        var y = 10;
        var z =++x + y--;  // el ++x es el pre incremento de x

        System.out.println("x = " + x); //6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16

        var resultado = 4 + 5 * 6 / 3; // 4 + (5*6);

        System.out.println("resultado = " + resultado); //14 
        
        resultado = (4 + 5)* 6/3;

        System.out.println("resultado = " + resultado);


    

    }

}
