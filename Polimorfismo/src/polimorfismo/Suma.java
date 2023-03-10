/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author emers
 */
public class Suma extends OperacionesClasePadre {

    @Override
    // override ,vamos a sobre escribir un metodo || y de escribir igual al metodo abstract heredado
    public void operations() {
        resultado = valor1 + valor2;
    }
}
