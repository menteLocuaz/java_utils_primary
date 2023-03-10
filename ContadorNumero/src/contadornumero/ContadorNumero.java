/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornumero;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class ContadorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,ritmo;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));
        String numeroString = String.valueOf(numero);
        int longitud = numeroString.length();

        System.out.println("La longitud del número " + numero + " es " + longitud);

    }

}
