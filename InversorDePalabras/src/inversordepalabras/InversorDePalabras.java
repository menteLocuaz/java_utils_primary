package inversordepalabras;

import java.util.Scanner;

/**
 * @author emers
 */
public class InversorDePalabras {

    public static void main(String[] args) {
        String palabra = "", palabraInvertidad = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra o frase :");
        palabra = entrada.nextLine();
        // debes de contar todo los caracteres
        longitudPalabra = palabra.length();
        while (longitudPalabra != 0) {
            palabraInvertidad += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }
        System.out.print("Palabra invertida es : " + palabraInvertidad);
        System.out.println("");
    }

}
