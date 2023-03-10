package area;

public class RectanguloMain {

    private int base, altura, area;

    // este costructor atrapamos o recivimos los datos de rectangulo
    public RectanguloMain(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // creamos el metodo para hacer el calculo de la area
    public void CalcularArea() {
        area = base * altura;
    }

    // enviamos el resultados
    public void ImprimirRectan() {
        System.out.println("El resulta de la area es : " + area);
    }
}
