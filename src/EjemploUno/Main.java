package EjemploUno;

public class Main {
    public static void main(String[] args) {
    MetodoPago tarjeta = new TarjetaCredito();
    ProcesadorPago procesador = new ProcesadorPago(tarjeta);
    procesador.realizarPago(20000.00);
    MetodoPago paypal = new Paypal();
    procesador = new ProcesadorPago(paypal);
    procesador.realizarPago(2000.00);
    }
}