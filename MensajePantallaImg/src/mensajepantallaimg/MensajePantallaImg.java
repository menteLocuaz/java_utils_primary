/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajepantallaimg;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class MensajePantallaImg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String caden;
        int entero;
        char letra;
        double decimal;

        caden = JOptionPane.showInputDialog("Escriba una palabra: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Deme un entero"));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Deme un Decimal"));
        JOptionPane.showMessageDialog(null, "EL entero es " + entero);

        // vamos a sacar la raiz cuadrada de un numero
        //int raiz = (int)Math.sqrt(9);
        double raiz = Math.sqrt(25);
        System.out.println(raiz);
        int valor1 = 50, valor2 = 80, valor3 = 20, resultado;
        resultado = (valor1 + valor2 + valor3) / 3;
        System.out.println("el resultado es" + resultado);
    }

}
