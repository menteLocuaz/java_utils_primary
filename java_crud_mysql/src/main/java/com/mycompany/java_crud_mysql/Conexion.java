/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class Conexion {

    // declaramos las variable de la base de datos
    String Usuario = "root";
    String Password = "";
    String DB = "javamysql";
    String Ip = "localhost";
    String Puerto = "3306";
    String cadena = "jdbc:mysql://" + Ip + ":" + Puerto + "/" + DB;

    Connection conectar = null;

    // Aqui abrimos la conexion s ls base de datos
    public Connection EstableceConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, Usuario, Password);
            //JOptionPane.showMessageDialog(null, "Conexion establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a la conexion de la base de datos" + e.toString());
        }
        return conectar;
    }

}
