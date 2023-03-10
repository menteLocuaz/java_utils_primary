/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author emers
 */
public class Resta extends OperacionesClasePadre {

    // SE LLAMA IGUAL DE LA OTRA HIJA PERO COMPORTANDOSE DIFERENTE
    @Override
    public void operations() {
        resultado = valor1 - valor2;
    }
}
