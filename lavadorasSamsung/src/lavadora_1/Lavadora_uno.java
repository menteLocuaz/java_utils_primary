package lavadora_1;

import funcion_aparte.LLFunciones;
import java.util.Scanner;

public class Lavadora_uno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" ¿ La ropa es blanca o de color?");
        System.out.println(" 1-Ropa blanca / 2-Ropa de color");
        int tipoDeRopa = entrada.nextInt();

        System.out.println(" ¿Cunatso kilos tiene la ropa?");
        int kilos = entrada.nextInt();
        // hacer la instacian o la comunicacion de clases 
        LLFunciones mensajero = new LLFunciones(kilos, tipoDeRopa);
        mensajero.CicloFinalizado();
        

    }
}
