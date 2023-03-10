/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author emers
 */
public class ClassMultiplicar extends OperacionesPrincipal {

    @Override
    public void MahtResultado() {
        RequestData();
        resultado = valor1 * valor2;
        Resultado();

    }
}
