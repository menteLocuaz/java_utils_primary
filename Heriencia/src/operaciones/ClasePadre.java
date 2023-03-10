/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public class ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    // Creamos un metodo que pide los numeros ppara la operacion
    public void PedirDatos() {
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Dmae el segundo valor : ");
        valor2 = entrada.nextInt();
    }

    //Cree un metodo que muestra el resultado
    public void MostrarResultado() {
        System.out.println("El resultado es : " + resultado);
    }

}
