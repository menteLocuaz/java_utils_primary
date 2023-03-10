package sumar;
// llamamos a Scanner para solucitar los numeros

public class suma {

    private int v1, v2, resultado;

    // crramos un costrutor que reciva los datos de la clase sumaMain
    public suma(int valorUno, int valorDos) {
        // recivimos los valores y lo guardamos
        this.v1 = valorUno;
        this.v2 = valorDos;
    }

    // creamos un metodo para la suma
    public void operacionSuma() {
        resultado = v1 + v2;
    }

    // llamamos el metodo operacion 
    public void imprimir() {
        operacionSuma();
        System.out.println("El resultado de la suma es : " + resultado);
    }

}
