public class Main {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar () {
        CarroCompra carro = new CarroCompra();
        carro.mostrarTotal();
        /*
        En este metodo que imprime, se iniciliza el metodo dentro de la clase carrocompra,
        ya que es un metodo privado de esa clase
        A su vez, el metodo calcularTotal depende del
        metodo multiplicar de la clase Calculadora
         */


    }
}
