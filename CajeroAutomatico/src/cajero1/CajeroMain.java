/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

/**
 *
 * @author emers
 */
public class CajeroMain {

    public static void main(String[] args) {
        /* Se hace un llamada a la clase hija como en el polimorfismo ya no se pude llamar la clse padre
         * ya que es abstracta y no se puede usar en esta clase ,se hace una instancia de la calse hija
         * para poder hacerder a los metodos   
         * 
         */
        ClassFuncionOperaciones mensajero = new ClassEcadenamientoAcciones();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }

}
