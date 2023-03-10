
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentos;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class Descuentos {

    public static void main(String[] args) {
        // TODO code application logic here
        double compra, descuento = 20, resultado, total;
        compra = Integer.parseInt(JOptionPane.showInputDialog("De cuanto fue la compra: "));
        if (compra >= 300) {
            resultado = (compra * descuento) / 100;
            total = compra - resultado;
            JOptionPane.showMessageDialog(null, "EL total a pagar es :" + total);
        } else {
            JOptionPane.showMessageDialog(null, "NO tiene descuento se debe pagar es : " + compra);
        }
    }

}
