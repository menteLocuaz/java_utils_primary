package sumar;

import java.util.Scanner;

public class sumaMain {

    public static void main(String[] args) {
        // vamos a pedir los valores al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el primer Valor: ");
        int valorUno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();
        // vemos enviar estos valores a otra clase llamada suma suma
        suma valores = new suma(valorUno, valorDos);
        // vamos a llamar el metodo la clase suma que hace la suma
        valores.imprimir();

    }
}
