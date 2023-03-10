package polimorfismo;

import java.util.Scanner;

public class ClassPrincipal {

    public static void main(String[] args) {
        int optionsl;
        Scanner entrada = new Scanner(System.in);
        // como es polimorfismo hereda de la clase hija
        OperacionesClasePadre mensajeroSum = new Suma();
        OperacionesClasePadre mensajeroRes = new Resta();
        // damos al usuario de elegir que operacion hacer 1-suma 2 resta
        System.out.println("Que operacion va a seleccionar \n 1-Suma \n 2-Resta");
        optionsl = entrada.nextInt();
        switch (optionsl) {
            case 1 -> {
                mensajeroSum.requestData();
                mensajeroSum.operations();
                mensajeroSum.showResult();
            }
            case 2 -> {
                mensajeroRes.requestData();
                mensajeroRes.operations();
                mensajeroRes.showResult();
            }
            default -> {
                System.out.println("NO existe la funcion ,Se pasa a resta");
                mensajeroRes.requestData();
                mensajeroRes.operations();
                mensajeroRes.showResult();
            }

        }

    }

}
