/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero1;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public abstract class ClassFuncionOperaciones {

    // inicimos los valores y lo encasulamos para que ste mas protegido 
    protected int transaciones, retiro, deposito;
    // el valor estatico no se puede haceder, solo atraves de stter y getter
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    /*
     * iniciamos un metodo que se llama operaciones que funciona,repita el mensaje en la pantalla
     * y que el usuario tiene cuatro opciones donde el 1- es la consulta de saldo, 2- es la opcion de retiro de 
     * ecfectivo en la cuenta,3- es la opcion donde el usuario deposita o guarsad el ecfitivo en el sistema,
     * 4- es la opcion que puede salir del sistema y del mensaje que se repite en el cajero
     */
    public void Operaciones() {
        int badera = 0;
        int selecion = 0;
        do {
            do {
                System.out.println("Porfavor selecione una opcion");
                System.out.println("    1.Consulta de saldo.");
                System.out.println("    2.Retiro de ecfectivo.");
                System.out.println("    3.Deposita en ecfectivo.");
                System.out.println("    4.Salir.");
                selecion = entrada.nextInt();
                // control de otra opcion
                if (selecion >= 1 && selecion <= 4) {
                    badera = 1;
                } else {
                    System.out.println("----------------------------------------");
                    System.out.println("Opcion no disponible,Vuelva intentarlo. ");
                    System.out.println("----------------------------------------");
                }
            } while (badera == 0);
            // manejamos la opciones que entra el usuario
            switch (selecion) {
                case 1 -> {
                    ClassFuncionOperaciones mensajero = new ClassEcadenamientoAcciones();
                    mensajero.Transaciones();
                }
                case 2 -> {
                    ClassFuncionOperaciones mensajeroRetiro = new ClassOperaccionRetiro();
                    mensajeroRetiro.Transaciones();
                }
                case 3 -> {
                    ClassFuncionOperaciones mensajeroDeposito = new ClassOperaccionDepositar();
                    mensajeroDeposito.Transaciones();
                }
                case 4 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    !Gracias¡, Vuelva pronto.");
                    System.out.println("---------------------------------------");
                    badera = 2;
                }
                default -> {
                }
            }
        } while (badera != 2);
    }

    // metodo de pedir la cantidad que va retirar 
    public void Retiro() {
        retiro = entrada.nextInt();
    }

    // metodo paar solicitar el deposito
    public void Deposito() {
        deposito = entrada.nextInt();
    }

    // polimoefismo
    public abstract void Transaciones();

    // metodos setter y getter
    /* El metodo saldo es stacti y no se pude acceder a este variable se utiliza un metodo deonde 
     * se encarga de darle un valor a una propiedad o atributo de un objeto, el cual está encapsulado en 
     * la clase correspondiente, es decir, esta declarado con la palabra reservada private o protected.
     * Donde se usa setter para altera el valor y el getter para pasar el valor a otras clase para se 
     * maneje segun lo deseado por el programador
     */
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
