/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropar;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIme un numero si es par p impar : "));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "EL numero es par :" + numero);
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar :" + numero);
        }

    }

}
