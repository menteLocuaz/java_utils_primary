/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_mysql;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author emers
 */
public class Registro_Alumnos {

    int ID;
    String Nombres, Apellidos;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    // creamos un metodo para la insercion de datos
    public void InsertarAlumnos(JTextField paramNombres, JTextField paramApellidos) {
        // obtenemos los datos de JtextField del Gui 
        setNombres(paramNombres.getText());
        setApellidos(paramApellidos.getText());
        // una conexion para insertar los datos
        Conexion objetoConexion = new Conexion();
        // Aqui se hace la consulta a la base de datos
        String ConsultaDeInsercion = "INSERT INTO alumnos (nombres,apellidos) values (?,?);";

        try {
            // Aqui se prepara la conexion y la consulta
            CallableStatement cs = objetoConexion.EstableceConexion().prepareCall(ConsultaDeInsercion);
            // aqui ponemos los parametros de otencion de datos de Jtextfield de setter y getter
            cs.setString(1, getNombres());
            cs.setString(2, getApellidos());
            // Que se ejucute la consulta con los parametros anteriores
            cs.execute();
            // creamos un mensaje que se ejecuto correctamente 
            JOptionPane.showMessageDialog(null, "Se creo el registro");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo la creacion del registro: " + e.toString());
        }
    }
// creamos un metodo para mostrar los datos donde se pide el rarametro de JTable

    public void MostrarAlumnos(JTable paramTablaTpotalAlumnos) {
        // establecemos ña conexion a base de datos
        Conexion objetoConexion = new Conexion();
        // creamos un mdelo de la tabla para poder llenarlo
        DefaultTableModel modelo = new DefaultTableModel();
        // Aqui se oefena la tabla
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        // incorporo el orden de cabezera
        paramTablaTpotalAlumnos.setRowSorter(OrdenarTabla);
        // creamos la consulta en la base de datos
        String MostrarDatosSql = "select * from alumnos";
        // incorporo el modelo las columnas de la tabla
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        // De los parametros le meto el modelo
        paramTablaTpotalAlumnos.setModel(modelo);
        //  Va llenar la consulta que va a realizar a la tabla :3 es de la cabezera id,nombres,apellidos
        String[] datos = new String[3];
        // prerparamos la consulta 
        Statement st;
        try {
            // realixamos la conexion
            st = objetoConexion.EstableceConexion().createStatement();
            // ejecutar la consulta de sql
            ResultSet result = st.executeQuery(MostrarDatosSql);
            // recoresmos la tabla para los rsultados
            while (result.next()) {
                // que me muestre los datos
                datos[0] = result.getString(1);
                datos[1] = result.getString(2);
                datos[2] = result.getString(3);
                // que la tabla incorpore los datos obtenidos
                modelo.addRow(datos);
            }
            // incorporamos el modelo anterior
            paramTablaTpotalAlumnos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros : " + e.toString());
        }

    }

    // Aqui lo primero es escoger los datos para despues modificar
    public void SeleccionarAlumnos(JTable paramTablaAlumnos, JTextField paramID, JTextField paramNombre, JTextField paramApellido) {
        // cada ves que selecione un registro se va a pasar a JtextFiel
        try {
            // Esta recore la fila a selecionar
            int fila = paramTablaAlumnos.getSelectedRow();
            // compara la fila para confirmar la selecion
            if (fila >= 0) {
                // obtengo lpos datos
                paramID.setText((paramTablaAlumnos.getValueAt(fila, 0).toString()));
                paramNombre.setText((paramTablaAlumnos.getValueAt(fila, 1).toString()));
                paramApellido.setText((paramTablaAlumnos.getValueAt(fila, 2).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila No selecionadada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selecion ,error: " + e.toString());
        }
    }

    //  este metodo se modifica los datos de la tabla
    public void ModificarTablaAlumnos(JTextField paramId, JTextField paramNombre, JTextField paramApellido) {
        // obtengo el valor de el id atraves de setter y lo parseo a entero
        setID(Integer.parseInt(paramId.getText()));
        setNombres(paramNombre.getText());
        setApellidos(paramApellido.getText());

        // preparamos la conexion a la base de datos
        Conexion objetoConexion = new Conexion();
        // creamos la variable para hacer la consulta
        String sqlModificarFila = "UPDATE alumnos SET alumnos.nombres=?,alumnos.apellidos=? WHERE alumnos.id=?; ";
        // hacemos la modificacion
        try {
            CallableStatement cs = objetoConexion.EstableceConexion().prepareCall(sqlModificarFila);
            // imcorporamos los parametros
            cs.setString(1, getNombres());
            cs.setString(2, getApellidos());
            cs.setInt(3, getID());
            // incorporamos los parametros y lo ejecutamos
            cs.execute();
            JOptionPane.showMessageDialog(null, "La actualizacion se ha completado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
            JOptionPane.showMessageDialog(null, "No se pudo modificar, Error" + e.toString());
        }
    }

    // metodo para eliminar 
    public void Eliminarfila(JTextField paramCodigoId) {
        // comvierto la varible para poder identificar
        setID(Integer.parseInt(paramCodigoId.getText()));
        // prepara la conexion
        Conexion objetoConexion = new Conexion();
        // preparo la sentecia sql para eliminar
        String sqlEliminarRow = "DELETE FROM alumnos WHERE alumnos.id=?";
        try {
            CallableStatement cs = objetoConexion.EstableceConexion().prepareCall(sqlEliminarRow);
            cs.setInt(1, getID());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Registro Eliminado ");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eroor en la Eliminado :" + e.toString());
        }

    }

}
