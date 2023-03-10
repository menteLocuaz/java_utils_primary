/*
 * Clase para una lavadora 
 */
package funcion_aparte;

public class LLFunciones {

    // el cero significa que esta apagado o no ha iniciado y 1 que comiensa la accion
    // tipo de ropa ,1 ropa de color blanco ,2 ropa de color
    private int kilos = 0, tipoDeRopa = 0, llenadoCompleto = 0, lavadoCompleto = 0, secado = 0;

    // El constructor LLFuncion recive los datos de otra clase 
    public LLFunciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    // Hacemos el metodo de comprobar si la lavadora esta llena
    private void llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenado ...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa es muy pesada ,reduce la carga o peso");
        }
    }

    private void lavado() {
        llenado();
        if (llenadoCompleto == 1) {
            switch (tipoDeRopa) {
                case 1:
                    System.out.println("Ropa blanca/ Lavado suave");
                    System.out.println("Lavando....");
                    lavadoCompleto = 1;
                    break;
                case 2:
                    System.out.println("Ropa de color/lavado intenso");
                    System.out.println("Lavando....");
                    lavadoCompleto = 1;
                    break;
                default:
                    System.out.println("tipo de ropa no esta disponuible");
                    System.out.println("se lavara como ropa de color / lavado intenso");
                    lavadoCompleto = 1;
                    break;
            }
        }
    }

    private void secado() {
        lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando.....");
            secado = 1;
        }
    }

    // Este metodo se hace publico para poder usarlo
    public void CicloFinalizado() {
        secado();
        if (secado == 1) {
            System.out.println("Tu ropa esta lista");
        }
    }

    // setter y getter
    // estamos renornado o hacien publico el valor o atributo
    public int getTipoDeRopa() {
        return tipoDeRopa;

    }

    // hacer public para se modifique la ropa 
    public void setTipoDeRopa(int TipoDeRopa) {
        this.tipoDeRopa = TipoDeRopa;
    }
}
