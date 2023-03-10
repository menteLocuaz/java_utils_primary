/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccionOP = 0, bandera = 0;
        Scanner entrada = new Scanner(System.in);

        try {
            do {
                do {
                    System.out.println("Porfavor selecione una opcion");
                    System.out.println("    1.Suma.");
                    System.out.println("    2.Resta.");
                    System.out.println("    3.Divicion.");
                    System.out.println("    4.Multiplicacion.");
                    System.out.println("    5.Salir.");
                    System.out.print("      --> ");
                    seleccionOP = entrada.nextInt();
                    // control de otra opcion
                    if (seleccionOP >= 1 && seleccionOP <= 5) {
                        bandera = 1;
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println("Opcion no disponible,Vuelva intentarlo. ");
                        System.out.println("----------------------------------------");
                    }
                } while (bandera == 0);
                switch (seleccionOP) {
                    case 1 -> {
                        OperacionesPrincipal mensaje = new ClassSuma();
                        mensaje.MahtResultado(); // suma
                    }
                    case 2 -> {
                        OperacionesPrincipal resta = new ClassResta();
                        resta.MahtResultado(); // resta 
                    }
                    case 3 -> {
                        OperacionesPrincipal divicion = new ClassDivicion();
                        divicion.MahtResultado();
                    }
                    case 4 -> {
                        OperacionesPrincipal multi = new ClassMultiplicar();
                        multi.MahtResultado();
                    }
                    case 5 -> {
                        System.out.println("---------------------------------------");
                        System.out.println("    Gracias, Vuelva pronto.");
                        System.out.println("---------------------------------------");
                        bandera = 2;
                    }
                    default ->
                        throw new AssertionError();
                }

            } while (bandera != 2);

        } catch (Exception e) {
            System.out.println("Error!! " + e);
        }

    }

}
