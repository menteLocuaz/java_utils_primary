/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import operaciones.ClaseHija_resta;
import operaciones.ClaseHija_suma;

/**
 *
 * @author emers
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion;
        Scanner entrada = new Scanner(System.in);

        // la opcionOperacion();
        // la opciones son para que operacion vas a utilizar 1- es suma y 2-es resta
        System.out.print("Opciones -> 1 para sumar \n            2 para restar :");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1 ->                 {
                    ClaseHija_suma suma = new ClaseHija_suma();
                    suma.PedirDatos();
                    suma.suma();
                    suma.MostrarResultado();
                }
            case 2 -> {
                ClaseHija_resta resta = new ClaseHija_resta();
                resta.PedirDatos();
                resta.resta();
            }
            default ->                 {
                    System.out.println("No hay esta opcion se opera como suma");
                    ClaseHija_suma suma = new ClaseHija_suma();
                    suma.PedirDatos();
                    suma.suma();
                    suma.MostrarResultado();
                }
        }
    }

}
