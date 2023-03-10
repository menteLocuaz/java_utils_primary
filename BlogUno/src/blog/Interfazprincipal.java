/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blog;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author emers
 */
public class Interfazprincipal extends JFRame implements ActionListener {

    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public MenuBar() {
        setLayout(null);
        // crear la barra 
        menuBar1 = new JMenuBar();
        setJMenuBar(menuBar1);
        // crear las pestañas desplegables
        menu1 = new JMenu("Opciones");
        // colocar dentro de la barra
        menuBar1.add(menu1);
        // programar las acciones
        menuItem1 = new JMenuItem("Rojo");
        menuItem1.addActionListener(this);
        menu1.add(menuItem1);

        menuItem2 = new JMenuItem("Verde");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);
    }

    // programar eventos
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
        if (e.getSource() == menuItem1) {
            // color rojo en el fondo
            fondo.setBackground(new Color(255, 0, 0));
        } else if (e.getSource() == menuItem2) {
            fondo.setBackground(new Color(0, 255, 0));
        } else if (e.getSource() == menuItem3) {
            fondo.setBackground(new Color(0, 0, 255));
        }
    }

    public static void main(String[] args) {
        MenuBar formulario1 = new MenuBar();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
