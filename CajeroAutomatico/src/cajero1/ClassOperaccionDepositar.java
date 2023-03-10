/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

/**
 *
 * @author emers
 */
public class ClassOperaccionDepositar extends ClassFuncionOperaciones {

    /* Con esta clase ClassOperaccionDepositar  estamos  heredando las propiedades y métodos de una clase padre en 
     * nuestra clase hija. Esta palabra clave extends establece la relación de herencia entre dos clases. 
     * La utilizamos al crear una clase derivada de la clase padre o al crear una subclase de la superclase.
     * donde con @Override estamos sobre escribiendo el metosdo abstracto para que sume o agrege la cantida que 
     * el usuario desee y que no sobre pase de su prosupuesto o el dinero haorrado en metoso getter getSaldo 
     * donde se suma el dinero a guardar actual del usuario.cambiamos el comportamieto del metodo heredado Trasaciones()  
     */
    @Override
    public void Transaciones() {
        System.out.println("---------------------------------------");
        System.out.print("    Cuanto dese depositar : ");
        Deposito();
        // que el valor a agregar no se a cero
        if (deposito <= getSaldo()) {
            transaciones = getSaldo();
            setSaldo(transaciones + deposito);
            System.out.println("---------------------------------------");
            System.out.println("estas es : " + deposito);
            System.out.println("Tu saldo actual es :" + getSaldo());
            System.out.println("---------------------------------------");

        } else {
            System.out.println("---------------------------------------");
            System.out.println("    Operacion interrupida. ");
            System.out.println("---------------------------------------");
        }
    }
}
