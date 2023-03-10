/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class EjercicioArreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadArreglo;
        // pedimos al user que ingrese la cantidad del array
        cantidadArreglo = Integer.parseInt(JOptionPane.showInputDialog("De caunto quieres el arreglo : "));
        int[] leerLosNumeros = new int[cantidadArreglo];
        // hacemos una iteracion de cada elemento para asignar valor
        for (int i = 0; i < cantidadArreglo; i++) {
            System.out.print((i + 1) + " Dame el dato :");
            leerLosNumeros[i] = entrada.nextInt();
        }
        // mostramos los datos puesto por user
        for (int i : leerLosNumeros) {
            
            System.out.println("-> " + i);
        }

    }

}
