/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public abstract class OperacionesClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    // Creamos un metodo o funcion don este metodo va a pedir los dadots necesario
    public void requestData() {
        System.out.print("Dame el primer valor : ");
        valor1 = entrada.nextInt();

        System.out.print("Dame el segundo valor : ");
        valor2 = entrada.nextInt();
    }

    // aqui vamos a crear el polimorfismo
    public abstract void operations();

    public void showResult() {
        System.out.println("EL resultado es : " + resultado);
    }
}
