package arreglo_clase41;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglo_Clase41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];
        int pedirArreglo;
        numeros[0] = 12;
        numeros[1] = 23;
        numeros[2] = 33;

        for (int i = 0; i < 3; i++) {
            System.out.println("El numero es :" + numeros[i]);
        }
        // pedimos la longitdu o cuanto va el array
        pedirArreglo = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantida de el arreglo"));
        char[] mostrarenPantalla = new char[pedirArreglo];

        for (int i = 0; i < pedirArreglo; i++) {
            System.out.print((i + 1) + " Digite un caractr :");
            mostrarenPantalla[i] = entrada.next().charAt(0);

        }
        System.out.println("Los datos ingresados son :");
        for (int i = 0; i < pedirArreglo; i++) {
            System.out.println("-> " + mostrarenPantalla[i]);
        }

    }

}
