/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

/**
 *
 * @author emers
 */
public class ClassOperaccionRetiro extends ClassFuncionOperaciones {

    /* Con esta clase ClassOperaccionRetiro  estamos  heredando las propiedades y métodos de una clase padre en 
     * nuestra clase hija. Esta palabra clave extends establece la relación de herencia entre dos clases. 
     * La utilizamos al crear una clase derivada de la clase padre o al crear una subclase de la superclase.
     * donde con @Override estamos sobre escribiendo el metosdp abstracto para que reste o quita la cantida que 
     * el usuario desee y que no sobre pase de su prosupuesto o el dinero haorrado en metoso getter getSaldo 
     * donde se resta el dinero a retira actual del usuario.cambiamos el comportamieto del metodo heredado Trasaciones()  
     */
    @Override
    public void Transaciones() {
        System.out.println("---------------------------------------");
        System.out.print("    Cuanto dese retirar : ");
        Retiro();
        // que el dinero no sea menor o igual de lo que va a sacar de la cuenta
        if (retiro <= getSaldo()) {
            transaciones = getSaldo();
            setSaldo(transaciones - retiro);
            System.out.println("---------------------------------------");
            System.out.println("estas retirando : " + retiro);
            System.out.println("Tu saldo actual es :" + getSaldo());
            System.out.println("---------------------------------------");

        } else {
            System.out.println("---------------------------------------");
            System.out.println("    Saldo insuficiente");
            System.out.println("---------------------------------------");
        }
    }
}
