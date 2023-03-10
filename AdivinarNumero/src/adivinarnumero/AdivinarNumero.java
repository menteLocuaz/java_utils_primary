/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUser, numRandom, posicion = 0;
        Random aleatori = new Random();
        numRandom = aleatori.nextInt(10);
        // pedir datos al user
        numUser = Integer.parseInt(JOptionPane.showInputDialog("Bade un numero de 1 al 10 : "));

        do {
            if (numUser > numRandom) {
                JOptionPane.showMessageDialog(null, "Intente con un numero mas bajo " + numUser);
                posicion = 0;
            } else if (numUser < numRandom) {
                JOptionPane.showMessageDialog(null, "Intente con un numero mas alto " + numUser);
                posicion = 0;
            } else if (numUser == numRandom) {
                JOptionPane.showMessageDialog(null, "-------> Ganaste <----------------- ");
                posicion += 1;
            }3

        } while (posicion == 1);
        System.out.println("el numero es " + numRandom);
    }

}
