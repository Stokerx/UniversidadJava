package fase3;

public class bucle3s {

    public static void main(String[] args) {
        /*for (var contador = 0; contador < 3 ; contador++){ // primera forma tan gozu
            if (contador % 2 == 0){ //metodo para contar los valores en par
                System.out.println("contador = " + contador); //mostrar el contador
                break; //termina el bucle
                
            }
        }*/
        
        //otra forma
        
        for(var contador = 0; contador < 10; contador++){
            if (contador % 2 == 0){
                continue; // ir ala siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }

    }
}
