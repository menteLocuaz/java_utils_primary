/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

/**
 *
 * @author emers
 */
public class ClassEcadenamientoAcciones extends ClassFuncionOperaciones {

    /* Con esta clase ClassEcadenamientoAcciones  estamos  heredando las propiedades y métodos de una clase padre en 
     * nuestra clase hija. Esta palabra clave extends establece la relación de herencia entre dos clases. 
     * La utilizamos al crear una clase derivada de la clase padre o al crear una subclase de la superclase.
     * donde con @Override estamos sobre escribiendo el metosdp abstracto para que nos muetre el saldo 
     * actual del usuario del metodo heredado Trasaciones()  
     */
    @Override
    public void Transaciones() {
        System.out.println("---------------------------------------");
        System.out.println("    Tu saldo actual es : " + getSaldo());
        System.out.println("---------------------------------------");
    }

}
