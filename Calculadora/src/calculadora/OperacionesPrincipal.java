/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public abstract class OperacionesPrincipal {

    int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    // creamos un metodo que pida los datos
    public void RequestData() {
        System.out.println("------------------------------");
        System.out.print("    Dame el priver valor: ");
        valor1 = entrada.nextInt();
        System.out.print("    Dame el segundo valor: ");
        valor2 = entrada.nextInt();
        System.out.println("------------------------------");
    }

    // mostrar el resuktado 
    public void Resultado() {
        System.out.println("------------------------------");
        System.out.println("    La respuesta es : " + resultado);
        System.out.println("------------------------------");
    }

    public abstract void MahtResultado();

}
