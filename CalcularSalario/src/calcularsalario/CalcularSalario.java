/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularsalario;

import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class CalcularSalario {

    public static void main(String[] args) {
        double horas, semana = 30, sueldo = 16, horasTotal;

        horas = Double.parseDouble(JOptionPane.showInputDialog("Cuantas horas trabajo : "));
        if (horas <= 40) {
            horasTotal = horas * sueldo;
            JOptionPane.showMessageDialog(null, "EL sueldo sin horas extra es :" + horasTotal);
        } else if (horas >= 40) {
            horasTotal = (40 * sueldo) + (horas - 40) * 20;
            JOptionPane.showMessageDialog(null, "EL sueldo con horas extra es :" + horasTotal);
        } else {
            System.out.println("No hay opcines ");
        }
    }

}
