package area;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // solicita,os los datos al usuario desde teclado
        System.out.print("Dame el valor de la base : ");
        int base = entrada.nextInt();

        System.out.print("Dame el valor de la altura : ");
        int altura = entrada.nextInt();

        RectanguloMain mensajero = new RectanguloMain(base, altura);
        mensajero.ImprimirRectan();

    }

}
