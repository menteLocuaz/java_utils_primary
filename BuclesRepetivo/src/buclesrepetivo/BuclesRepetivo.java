/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesrepetivo;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class BuclesRepetivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, bandera = 0;
        /*while (valor1 <= 10) {
            System.out.println("El numero es :" + valor1);
            valor1++;
        }*/
        do {
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero : "));
            if (valor1 >= 1) {
                JOptionPane.showMessageDialog(null, "EL numero es positivo");
            } else if (valor1 <= 0) {
                bandera += 2;
                JOptionPane.showMessageDialog(null, "EL numero es negativo");
            }
        } while (bandera >= 1);

    }

}
