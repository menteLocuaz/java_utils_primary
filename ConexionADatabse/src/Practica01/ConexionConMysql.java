package Practica01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.sun.jdi.connect.spi.Connection;
public class ConexionConMysql {

    String NombreDeDatos = "javamysql";
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public ConexionConMysql() {

    }

    public Connection conectar() {

        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + NombreDeDatos, user, password);
            System.out.println("Se conecto la DB ------------------------------------>");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se conecto --------------------------------------->");
            Logger.getLogger(ConexionConMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;

    }

    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionConMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        ConexionConMysql coneccion = new ConexionConMysql();
        coneccion.conectar();
    }
}
