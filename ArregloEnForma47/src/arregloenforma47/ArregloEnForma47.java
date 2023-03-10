/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloenforma47;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public class ArregloEnForma47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // importamos scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;
        // creamos la entrada de los datos y lo guardamos 
        for (int i = 0; 1 < 10; i++) {
            System.out.print((i + 1) + " Digite el numero de la lista : ");
            arreglo[i] = entrada.nextInt();
        }
        // hacemos un arreglo que recorrar si los numeros son crecisente o descreciente
     
    }
}
